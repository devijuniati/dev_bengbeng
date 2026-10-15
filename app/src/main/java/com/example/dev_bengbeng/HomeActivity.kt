package com.example.dev_bengbeng

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbarHome)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        // Navigation ke EdukasiWebActivity
        val btnWebEdukasi = findViewById<Button>(R.id.btnWebEdukasi)
        btnWebEdukasi.setOnClickListener {
            val intent = Intent(this, EdukasiWebActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}