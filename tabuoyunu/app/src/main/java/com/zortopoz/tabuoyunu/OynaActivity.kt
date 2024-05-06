package com.zortopoz.tabuoyunu

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
    }
}