package com.example.listasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeNomes = listOf(
            "Android 4 Ice Cream Sandwich",
            "Android 4.1 Jelly Bean",
            "Android 4.4 KitKat",
            "Android 5 Lollipop",
            "Android 6 Marshmallow",
            "Android 7 Nougat",
            "Android 8 Oreo",
            "Android 9.0 Pie",
            "Android 10 Q"
        )

        val colors = resources.getStringArray(R.array.colors)

        val recycler = findViewById<RecyclerView>(R.id.rvListaDeVersoes)
        recycler.adapter = DroidVersionAdapter(listaDeNomes, colors)


    }
}