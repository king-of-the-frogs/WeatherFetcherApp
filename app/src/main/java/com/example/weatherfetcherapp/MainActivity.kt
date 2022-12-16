package com.example.weatherfetcherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherfetcher.R
import com.example.weatherfetcher.features.weather_screen.data.WeatherRemoteSource
import com.example.weatherfetcher.features.weather_screen.data.WeatherRepoImpl
import com.example.weatherfetcherapp.WeatherActivity
import com.example.weatherfetcherapp.WindActivity
import com.example.weatherfetcherapp.features.weather_screen.WeatherInteractor
import com.example.weatherfetcherapp.features.weather_screen.data.WeatherApiClient
import com.example.weatherfetcherapp.features.weather_screen.ui.WeatherScreenPresenter
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: WeatherScreenPresenter



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = WeatherScreenPresenter(
            WeatherInteractor(
                WeatherRepoImpl(
                    WeatherRemoteSource(WeatherApiClient.getApi())
                )
            )
        )

        var weather = ""
        val textViewHello = findViewById<TextView>(R.id.tvHello)

        GlobalScope.launch {
            Log.d("NET",presenter.interactor.getWeather())
        }


        textViewHello.text
    }
}