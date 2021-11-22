package com.example.listasjetpack


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(titulo : String, url:String, urlDetalle: String, descripcion:String, valoracion: Float, fecha: String){
    val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .verticalScroll(scrollState))
    {
        Surface(modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)) {
            CargarImagen(url = urlDetalle)
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            propagateMinConstraints =true){
            Column() {
                Text(text = titulo, fontWeight = FontWeight.Bold, fontSize = 35.sp)
                Text(text = "Valoración: $valoracion/10",modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
                Text(text = descripcion, textAlign = TextAlign.Justify, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = fecha)
            }
        }
    }
}

