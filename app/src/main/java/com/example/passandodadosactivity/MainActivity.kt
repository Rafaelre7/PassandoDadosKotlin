package com.example.passandodadosactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonEnviar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentes()

        buttonEnviar.setOnClickListener { passandoDados(it) }
    }

    private fun passandoDados(it: View?) {
        Log.d("Teste", "Ola mundo")
        val intent = Intent(this,SegundaActivity::class.java)


        //Passando dados
        intent.putExtra("nome","Rafael")
        intent.putExtra("idade",22)

        //Passando objeto
        intent.putExtra("objeto",Usuarios("Pimenta",22))


        startActivity(intent)
    }

    private fun inicializarComponentes(){

        buttonEnviar = findViewById(R.id.buttonEnviar)

    }

}

