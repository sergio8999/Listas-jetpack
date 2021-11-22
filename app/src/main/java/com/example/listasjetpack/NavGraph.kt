package com.example.listasjetpack

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@ExperimentalFoundationApi
@Composable
fun SetUpNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            Screen.Second.route,
            arguments = listOf(
                navArgument("titulo"){
                    type = NavType.StringType
                },
                navArgument("url"){
                    type = NavType.StringType
                },
                navArgument("urlDetalle"){
                    type = NavType.StringType
                },
                navArgument("descripcion"){
                    type = NavType.StringType
                },
                navArgument("valoracion"){
                    type = NavType.FloatType
                },
                navArgument("fecha"){
                    type = NavType.StringType
                }
            )
        ){
            navBackStackEntry ->
            SecondScreen(
                navBackStackEntry.arguments?.getString("titulo")!!,
                navBackStackEntry.arguments?.getString("url")!!,
                navBackStackEntry.arguments?.getString("urlDetalle")!!,
                navBackStackEntry.arguments?.getString("descripcion")!!,
                navBackStackEntry.arguments?.getFloat("valoracion")!!,
                navBackStackEntry.arguments?.getString("fecha")!!
            )
        }
    }
}