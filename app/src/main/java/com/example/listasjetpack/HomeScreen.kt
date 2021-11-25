package com.example.listasjetpack


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.listasjetpack.model.ArrayPeliculas
import com.example.listasjetpack.model.Pelicula


var listaPeliculas = mutableStateListOf<Pelicula>()
var indice = 0

@ExperimentalFoundationApi
@Composable
fun HomeScreen(navController: NavHostController){
    // Variables AlertDialog
    val (mostrarDialogo, setMostrarDialogo) =  remember { mutableStateOf(false) }

    Column() {
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)){
            itemsIndexed(ArrayPeliculas.listaPeliculas){
                index,pelicula->
                    Card(elevation= 4.dp,
                        modifier = Modifier
                        .combinedClickable(
                            onClick = {
                                navController.navigate(
                                    Screen.Second.passPelicula(
                                        pelicula.titulo,
                                        pelicula.url.replace("/","\\"),
                                        pelicula.urlDetalle.replace("/","\\"),
                                        pelicula.descripcion,
                                        pelicula.valoracion,
                                        pelicula.fecha
                                    )
                                )
                            },
                        onLongClick = {
                            indice = index
                            setMostrarDialogo(true)
                        })) {
                        Column() {
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .height(240.dp)
                                ) {
                                Column() {
                                    Surface(modifier = Modifier.height(240.dp)) {
                                        CargarImagen(url =  pelicula.url)
                                    }
                                }
                                val scrollState = rememberScrollState()
                                Column(modifier = Modifier
                                    .padding(7.dp)
                                    .fillMaxWidth()
                                        .verticalScroll(scrollState)) {
                                    Text(text = pelicula.titulo,fontWeight = FontWeight.Bold,fontSize = 17.sp)
                                    Text(text = pelicula.descripcion, fontSize = 15.sp)
                                }
                            }
                            Row() {
                                Text(text = pelicula.fecha, Modifier.padding(start = 5.dp))
                            }
                        }
                    }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
        AlertDialog(mostrarDialogo, setMostrarDialogo)
    }
}


@Composable
fun CargarImagen(url:String){
    Image(
        painter = rememberImagePainter(url),
        contentDescription = "Imagen",
        contentScale = ContentScale.Crop
    )

}

@Composable
    fun AlertDialog(mostrarDialogo: Boolean, setMostrarDialogo: (Boolean) -> Unit ){
    if (mostrarDialogo) {
        AlertDialog(
            onDismissRequest = {
            },
            title = {
                Text("Borrar pelicula")
            },
            confirmButton = {
                Button(
                    onClick = {
                        // Change the state to close the dialog
                        setMostrarDialogo(false)
                        ArrayPeliculas.listaPeliculas.removeAt(indice)
                    },
                ) {
                    Text("Confirmar")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        // Change the state to close the dialog
                        setMostrarDialogo(false)
                    },
                ) {
                    Text("Cancelar")
                }
            },
            text = {
                Text("¿Esta seguro de borrar la pelicula?")
            },
        )
    }
}

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewGreeting() {
    HomeScreen(
        navController = rememberNavController()
    )
}

