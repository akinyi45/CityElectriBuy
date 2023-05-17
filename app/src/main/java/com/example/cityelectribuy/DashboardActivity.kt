package com.example.cityelectribuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    lateinit var cardAddDivices:CardView
    lateinit var cardViewDivices:CardView
    lateinit var cardViewSettings:CardView
    lateinit var cardViewSearch:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        cardAddDivices = findViewById(R.id.mCardAddDivices)
        cardViewDivices = findViewById(R.id.mCardViewDivices)
        cardViewSettings = findViewById(R.id.settingcardview)
        cardViewSearch = findViewById(R.id.searchcardview)
        cardAddDivices.setOnClickListener {
            val intent = Intent(this, AdddivicesActivity::class.java)
            startActivity(intent)

        }
        cardViewDivices.setOnClickListener {
            val intent = Intent(this, ViewdivicesActivity::class.java)
            startActivity(intent)

        }

        cardViewSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)

        }
        cardViewSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)

        }


    }
}