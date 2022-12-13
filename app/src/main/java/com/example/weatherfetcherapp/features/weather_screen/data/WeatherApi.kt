package com.example.weatherfetcher.features.weather_screen.data


import com.example.weatherfetcherapp.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    fun getWeather(
        @Query("q") query: String,
        @Query("appid") apiKey: String = API_KEY
    ): Response<String>
}