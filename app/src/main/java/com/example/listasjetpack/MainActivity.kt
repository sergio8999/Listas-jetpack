package com.example.listasjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.listasjetpack.ui.theme.ListasJetpackTheme

class MainActivity : ComponentActivity() {
    lateinit var navControler: NavHostController

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListasJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background){
                    navControler = rememberNavController()
                    SetUpNavGraph(navController = navControler)
                }
            }
        }
    }
}
