package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecycle", "CREATE - estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "START - deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        Log.w("Lifecycle", "STOP -  a tela não está mais visível mas ainda existe")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", " \nRESTART - a tela está retomando o foco")
    }

    override fun onDestroy() {
        Log.w("Lifecycle", " \nDESTROY - oh não! a tela foi destruída")
        super.onDestroy()
    }
}