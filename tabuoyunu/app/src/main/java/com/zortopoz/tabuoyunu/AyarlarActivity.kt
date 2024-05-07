package com.zortopoz.tabuoyunu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zortopoz.tabuoyunu.databinding.ActivityAyarlarBinding

class AyarlarActivity : AppCompatActivity() {
    lateinit var binding: ActivityAyarlarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAyarlarBinding.inflate(layoutInflater)
        val ayarlarMenu = binding.root
        setContentView(ayarlarMenu)

        binding.imageButtonGeriGit.setOnClickListener {
            val anaMenu = Intent(applicationContext,MainActivity::class.java)
            startActivity(anaMenu)
        }
    }
}