package com.example.weatherfetcher.features.weather_screen.data

class WeatherRepoImpl(private val weatherRemoteSource: WeatherRemoteSource) : WeatherRepo {

    override fun getTemperature(): String {
        return weatherRemoteSource.getWeather().message()
    }

}