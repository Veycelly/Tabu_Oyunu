package com.zortopoz.tabuoyunu

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zortopoz.tabuoyunu.databinding.ActivityMainBinding
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val anaMenu = binding.root
        setContentView(anaMenu)


        binding.btnOyna.setOnClickListener {
            val oynaMenu = Intent(applicationContext, OynaActivity::class.java)
            startActivity(oynaMenu)
        }
        binding.btnAyarlar.setOnClickListener {
            val ayarlarMenu = Intent(applicationContext, AyarlarActivity::class.java)
            startActivity(ayarlarMenu)


        }

        val button = findViewById<Button>(R.id.btnKurallar)

        // Butona tıklandığında dialog penceresini aç
        button.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this)
            val message = "Tabu, kelime tahmin oyunudur. Oyun sırasında, bir oyuncu belirli bir kelimeyi tarif etmeye çalışırken, belirli kelimeleri kullanamaz. Oyuncular, kelimeyi tarif ederken hızlı düşünmeli ve yaratıcı olmalıdır. Takım arkadaşlarının doğru kelimeyi tahmin etmesi durumunda takım puan kazanır, ancak yasaklı kelimeleri kullanırlarsa puan kaybedebilirler. Oyun, eğlenceli bir rekabet ve hızlı düşünme yeteneğine dayalıdır."

            dialogBuilder.setMessage(message)
                .setPositiveButton("Tamam") { dialog, _ ->
                    dialog.dismiss()
                }

            val dialog = dialogBuilder.create()

            // Dialog penceresinin arka planını turuncu yapma
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFA500")))

            dialog.show()
        }
    }

    fun exitApp(view:View){
        finishAffinity()
        }

}