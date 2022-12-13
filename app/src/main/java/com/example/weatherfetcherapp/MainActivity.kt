package com.example.weatherfetcher

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherfetcherapp.WeatherActivity
import com.example.weatherfetcherapp.WindActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHello = findViewById<TextView>(R.id.tvHello)
        textViewHello.text = "Hello from code!"

        val btnWeather = findViewById<Button>(R.id.btnWeather)
        btnWeather.setOnClickListener {
            Intent(this, WeatherActivity::class.java).also(::startActivity)
        }

        val btnWind = findViewById<Button>(R.id.btnWind)
        btnWind.setOnClickListener {
            Intent(this, WindActivity::class.java).also(::startActivity)
        }
    }
}