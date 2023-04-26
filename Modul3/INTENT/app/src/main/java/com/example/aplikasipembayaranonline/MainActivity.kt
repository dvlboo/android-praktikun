package com.example.aplikasipembayaranonline

import android.content.Intent
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

//        val packageName = "com.gojek.wallet"
//        val scheme = "gopay://gopay"
//        val uri = Uri.parse(scheme)
        binding.cvPindahPembayaran.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(Intent.CATEGORY_APP_MAPS)
//                intent.`package` = packageName
                startActivity(intent)
            }
        )
    }
}
