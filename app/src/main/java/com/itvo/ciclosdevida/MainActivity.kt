package com.itvo.ciclosdevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    lateinit var txvMusica: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txvMusica = findViewById(R.id.txv_estatus_musica)

        Log.i("RegistroDeMiApp", "estamos en oncreate" )
        txvMusica.text = "REPRODUCIENDO MUSICA"
    }

    override fun onStart() {
        super.onStart()
        Log.i("RegistroDeMiApp", "estamos en onstart" )
    }

    override fun onResume() {
        super.onResume()
        Log.i("RegistroDeMiApp", "estamos en onresume" )
    }

    override fun onStop() {
        super.onStop()

        Log.i("RegistroDeMiApp", "estamos en onstop" )
        txvMusica.text="MUSICA PAUSADA"
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("RegistroDeMiApp", "estamos en ondestroy" )
    }

    override fun onPause() {
        super.onPause()
        Log.i("RegistroDeMiApp", "estamos en onpause" )
    }
}