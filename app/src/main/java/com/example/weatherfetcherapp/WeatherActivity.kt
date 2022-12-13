package com.example.weatherfetcherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherfetcher.R
import java.util.*

class WeatherActivity : AppCompatActivity() {

    private val weatherPresenter = WeatherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val tvTemperture = findViewById<TextView>(R.id.tvTemperature)
        tvTemperture.text = weatherPresenter.getWeather(UUID.randomUUID().toString())
    }

}