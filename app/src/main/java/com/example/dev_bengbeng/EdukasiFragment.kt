package com.example.dev_bengbeng

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class EdukasiFragment : Fragment() {

    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_edukasi_web, container, false)

        // Setup Toolbar
        val toolbar = view.findViewById<Toolbar>(R.id.toolbarWeb)
        (activity as? AppCompatActivity)?.setSupportActionBar(toolbar)

        // Setup WebView
        webView = view.findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        webView.loadUrl("https://www.bpdp.or.id")

        return view
    }
}