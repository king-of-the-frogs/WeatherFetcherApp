package com.example.weatherfetcher.features.weather_screen.data

import com.example.weatherfetcherapp.features.weather_screen.data.model.WeatherRemoteModel
import retrofit2.Response

class WeatherRemoteSource(private val api: WeatherApi) {

    // TODO add query
    suspend fun getWeather(): WeatherRemoteModel {
        return api.getWeather(query = "Moscow")
    }
}