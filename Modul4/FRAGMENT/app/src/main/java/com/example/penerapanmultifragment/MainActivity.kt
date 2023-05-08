package com.example.penerapanmultifragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), InputFragment.OnDataSubmitListener {

    private lateinit var inputFragment: InputFragment
    private lateinit var displayFragment: DisplayFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputFragment = InputFragment()
        displayFragment = DisplayFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, inputFragment)
            .commit()

        inputFragment.setOnDataSubmitListener(this)
    }

    override fun onDataSubmit(data: String) {
        displayFragment.updateData(data)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, displayFragment)
            .addToBackStack(null)
            .commit()
    }

}
