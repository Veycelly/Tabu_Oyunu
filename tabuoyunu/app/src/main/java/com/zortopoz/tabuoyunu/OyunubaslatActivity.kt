package com.zortopoz.tabuoyunu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zortopoz.tabuoyunu.databinding.ActivityOyunubaslatBinding

class OyunubaslatActivity : AppCompatActivity() {
    lateinit var binding: ActivityOyunubaslatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOyunubaslatBinding.inflate(layoutInflater)
        val oyunubaslatMenu = binding.root
        setContentView(oyunubaslatMenu)

        binding.imageViewGeriGit3.setOnClickListener {
            val geri = Intent(applicationContext,OynaActivity::class.java)
            startActivity(geri)
        }
        }


    }
