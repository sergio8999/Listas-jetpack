package com.example.listasjetpack

sealed class Screen (val route:String){
    object Home : Screen(route = "home_screen")
    object Second : Screen(route = "second_screen/{titulo}/{url}/{urlDetalle}/{descripcion}/{valoracion}/{fecha}"){

        fun passPelicula(
            titulo: String,
            url: String,
            urlDetalle: String,
            descripcion: String,
            valoracion: Float,
            fecha: String
        ) :String {
            return "second_screen/$titulo/$url/$urlDetalle/$descripcion/$valoracion/$fecha"
        }
    }
}