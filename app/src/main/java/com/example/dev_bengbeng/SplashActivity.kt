package com.example.dev_bengbeng

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay splash screen selama 2 detik
        Handler(Looper.getMainLooper()).postDelayed({
            // Pengecekan SharedPreferences isLogin
            val sharedPref = getSharedPreferences("UserSession", Context.MODE_PRIVATE)
            val isLogin = sharedPref.getBoolean("isLogin", false)

            if (isLogin) {
                // Jika sudah login -> Ke HomeActivity / MainActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                // Jika belum login -> Ke Halaman Login (MainActivity)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            finish() // Tutup SplashActivity agar tidak bisa di-back
        }, 2000)
    }
}