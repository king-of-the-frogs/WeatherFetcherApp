package com.example.weatherfetcher.features.weather_screen.data


import com.example.weatherfetcherapp.API_KEY
import com.example.weatherfetcherapp.features.weather_screen.data.model.WeatherRemoteModel
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getWeather(
        @Query("q") query: String,
        @Query("appid") apiKey: String = API_KEY
    ): WeatherRemoteModel
}