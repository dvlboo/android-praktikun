package com.example.aplikasipembayaranonline

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aplikasipembayaranonline.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivGithub.setOnClickListen  er(
            View.OnClickListener {
                val intent = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://github.com/dvlboo")
                )
                startActivity(intent)
            }
        )

        binding.ivInstagram.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://instagram.com/_kuhhh.ckr?igshid=ZDdkNTZiNTM=")
                )
                startActivity(intent)
            }
        )

        binding.ivLinkedin.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://linkedin.com/in/kukuhcokrowibowo")
                )
                startActivity(intent)
            }
        )

    }
}