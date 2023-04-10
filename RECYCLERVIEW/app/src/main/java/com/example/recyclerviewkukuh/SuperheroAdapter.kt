package com.example.recyclerviewkukuh

import android.content.Context
import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter (private val context: Context, private val superhero: List<Superhero>)
    : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>(){

    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val titleSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero) {
            imgSuperhero.setImageResource(superhero.imgSuperhero)
            titleSuperhero.text = superhero.titleSuperhero
            descSuperhero.text = superhero.descSuperhero

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(superhero[position])
    }

}