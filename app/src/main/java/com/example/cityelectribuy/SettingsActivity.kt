package com.example.cityelectribuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    lateinit var qualityButton: Button
    lateinit var accessibilityButton: Button
    lateinit var securityButton: Button
    lateinit var warrantyButton: Button
    lateinit var powerusegeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        qualityButton = findViewById(R.id.btnquality)
        accessibilityButton = findViewById(R.id.btnaccessability)
        securityButton = findViewById(R.id.btnsecurity)
        warrantyButton = findViewById(R.id.btnwarranty)
        powerusegeButton = findViewById(R.id.btnpoweruseage)
        qualityButton.setOnClickListener {
            val intent = Intent(this, QualityActivity::class.java)
            startActivity(intent)
        }
        accessibilityButton.setOnClickListener {
            val intent = Intent(this, AccessabilityActivity::class.java)
            startActivity(intent)
        }
        securityButton.setOnClickListener {
            val intent = Intent(this, SecurityActivity::class.java)
            startActivity(intent)
        }
        warrantyButton.setOnClickListener {
            val intent = Intent(this,   WarrantyActivity::class.java)
            startActivity(intent)
        }
        powerusegeButton.setOnClickListener {
            val intent = Intent(this, PowerusegeActivity::class.java)
            startActivity(intent)
        }
    }
}