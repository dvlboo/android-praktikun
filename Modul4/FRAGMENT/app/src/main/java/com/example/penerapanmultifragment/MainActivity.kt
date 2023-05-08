package com.example.penerapanmultifragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val inputFragment = InputFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, InputFragment())
            .commit()
    }

}
