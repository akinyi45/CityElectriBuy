package com.example.cityelectribuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class WarrantyActivity : AppCompatActivity() {
    lateinit var imgWarranty:ImageView
    lateinit var imgWarrantyTwo:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warranty)
        imgWarranty = findViewById(R.id.imgWarr)
        imgWarrantyTwo = findViewById(R.id.imgWarrTwo)
    }
}