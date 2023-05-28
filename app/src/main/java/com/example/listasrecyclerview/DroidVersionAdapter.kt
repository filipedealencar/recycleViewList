package com.example.listasrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DroidVersionAdapter(var listaDeNomes: List<String>, var colors: Array<String>): RecyclerView.Adapter<ItemViewHolder>() {
 
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaDeNomes.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val nomeDaVersao = listaDeNomes[position]
        val cor = colors[position]
        holder.configItem(nomeDaVersao, position, cor)
    }
}