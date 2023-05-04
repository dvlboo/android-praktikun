package com.example.aplikasipembayaranonline

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aplikasipembayaranonline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvTentangAplikasi.setOnClickListener(
            View.OnClickListener {
                Intent(this,AboutActivity::class.java).also { startActivity(it) }
            }
        )

        val packageName = "com.gojek.app"
        val scheme = "gojek://home"
        val uri = Uri.parse(scheme)
        binding.cvPindahPembayaran.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, uri)
                intent.`package` = packageName
                startActivity(intent)
            }
        )
    }
}
