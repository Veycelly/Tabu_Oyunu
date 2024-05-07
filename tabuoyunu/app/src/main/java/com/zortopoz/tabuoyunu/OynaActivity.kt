package com.zortopoz.tabuoyunu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zortopoz.tabuoyunu.databinding.ActivityMainBinding
import com.zortopoz.tabuoyunu.databinding.ActivityOynaBinding

class OynaActivity : AppCompatActivity() {
    lateinit var binding: ActivityOynaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOynaBinding.inflate(layoutInflater)
        val oynaMenu = binding.root
        setContentView(oynaMenu)

        binding.button.setOnClickListener {
            val oyunubaslatMenu = Intent(applicationContext, OyunubaslatActivity::class.java)
            startActivity(oyunubaslatMenu)
        }

        binding.imageButtonGeriGit2.setOnClickListener {
            val anaMenu = Intent(applicationContext,MainActivity::class.java)
            startActivity(anaMenu)
        }

    }
}