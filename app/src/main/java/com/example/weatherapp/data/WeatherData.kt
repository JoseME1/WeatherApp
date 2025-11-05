package com.example.weatherapp.data

sealed class WeatherData

data class CurrentLocation(
    val date: String,
    val location: String="Escoja su ubicación"
    ): WeatherData()