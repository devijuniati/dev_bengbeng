package com.example.dev_bengbeng

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menggunakan MaterialButton sesuai layout XML
        val btnMyProject = findViewById<MaterialButton>(R.id.btnMyProject)
        btnMyProject.setOnClickListener {
            val intent = Intent(this,
                DetailActivity::class.java)
            startActivity(intent)
        }
    }
}