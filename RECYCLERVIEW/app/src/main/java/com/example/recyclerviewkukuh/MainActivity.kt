package com.example.recyclerviewkukuh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.captain_america,
                "Captain Amerika",
                "Hero Marvel dengan kekuatan fisik dan kecerdasan tingkat tinggi"
            ),

            Superhero(
                R.drawable.iron_man,
                "Iron Man",
                "Hero Marvel dengan kecerdasan AI dan teknologi canggih"
            ),

            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hero Marvel dengan kekuatan fisik tiada tanding"
            ),

            Superhero(
                R.drawable.captain_america,
                "Captain Amerika",
                "Hero Marvel dengan kekuatan fisik dan kecerdasan tingkat tinggi"
            ),
            Superhero(
                R.drawable.iron_man,
                "Iron Man",
                "Hero Marvel dengan kecerdasan AI dan teknologi canggih"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hero Marvel dengan kekuatan fisik tiada tanding"
            ),
            Superhero(
                R.drawable.captain_america,
                "Captain Amerika",
                "Hero Marvel dengan kekuatan fisik dan kecerdasan tingkat tinggi"
            ),
            Superhero(
                R.drawable.iron_man,
                "Iron Man",
                "Hero Marvel dengan kecerdasan AI dan teknologi canggih"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hero Marvel dengan kekuatan fisik tiada tanding"
            ),
            Superhero(
                R.drawable.jokowi,
                "Joko Widodo",
                "Hero Nasional dengan kekuatan tiada tara dan kecerdasan tingkat tinggi"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList) {

        }
    }
}