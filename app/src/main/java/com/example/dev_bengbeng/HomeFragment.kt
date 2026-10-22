package com.example.dev_bengbeng

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Setup Toolbar di dalam Fragment
        val toolbar = view.findViewById<Toolbar>(R.id.toolbarHome)
        (activity as? AppCompatActivity)?.setSupportActionBar(toolbar)

        // Navigation ke EdukasiWebActivity dari button beranda
        val btnWebEdukasi = view.findViewById<Button>(R.id.btnWebEdukasi)
        btnWebEdukasi?.setOnClickListener {
            val intent = Intent(requireContext(), EdukasiWebActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}