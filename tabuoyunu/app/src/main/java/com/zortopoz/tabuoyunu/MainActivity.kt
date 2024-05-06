package com.zortopoz.tabuoyunu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zortopoz.tabuoyunu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val anaMenu = binding.root
        setContentView(anaMenu)


        binding.btnOyna.setOnClickListener{
            val oynaMenu = Intent(applicationContext,OynaActivity::class.java)
            startActivity(oynaMenu)
        }
    }
}