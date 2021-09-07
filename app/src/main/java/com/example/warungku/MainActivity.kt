package com.example.warungku

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun setPembayaran(view: View) {
        val intent = Intent (this,pembayaran::class.java)
        startActivity(intent)
        finish()
    }
}