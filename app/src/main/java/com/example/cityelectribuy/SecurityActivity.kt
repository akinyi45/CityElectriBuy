package com.example.cityelectribuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecurityActivity : AppCompatActivity() {
    lateinit var imgSettings:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security)

        imgSettings = findViewById(R.id.imgSett)
    }
}