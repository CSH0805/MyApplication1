package com.example.myapplication

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import com.example.myapplication.project.RandomDiceApp
import com.example.myapplication.project.SimpleDayApp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity(){
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                SimpleDayApp()
            }
        }
    }
}