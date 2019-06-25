package com.example.passandodadosactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {

    private lateinit var textNome: TextView
    private lateinit var textIdade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        inicializarComponentes()

        //Recuperar os dados enviados entre activity
        val dados: Bundle = intent.extras!!
        val usu: Usuarios

        val nome = dados.getString("nome")
        val idade = dados.getInt("idade")

        usu = dados.getSerializable("objeto") as Usuarios //as faz o cast

        Log.d("sout", usu.nome)

        textNome.setText(nome)
        textIdade.setText(idade.toString())
    }

    private fun inicializarComponentes() {

        textNome = findViewById(R.id.textNome)
        textIdade = findViewById(R.id.textIdade)
    }


}
