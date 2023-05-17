package com.example.cityelectribuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnAdmin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdmin = findViewById(R.id.mbtnadmin)
        btnAdmin.setOnClickListener {
            var tembea = Intent(this, DashboardActivity::class.java)
            startActivity(tembea)
        }
    }
}