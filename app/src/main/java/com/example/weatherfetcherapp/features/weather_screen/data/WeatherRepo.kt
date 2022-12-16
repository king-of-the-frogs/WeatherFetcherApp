package com.example.weatherfetcher.features.weather_screen.data

interface WeatherRepo {

    suspend fun getTemperature(): String
}