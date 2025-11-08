package com.example.weatherapp.data

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

sealed class WeatherData

data class CurrentLocation(
    val date: String=getCurrentDate(),
    val location: String="Escoja su ubicación",
    val latitude: Double?=null,
    val longitude: Double?=null
    ): WeatherData()

data class CurrentWeather(
    val icon: String,
    val temperature: Float,
    val wind: Float,
    val humidity: Int,
    val chanceOfRain: Int
) : WeatherData()

data class Forecast(
    val time: String,
    val temperature: Float,
    val feelsLikeTemperature: Float,
    val icon: String
) : WeatherData()

private fun getCurrentDate(): String{
    val currentDate = Date()
    val formatter= SimpleDateFormat("d MMMM yyyy", Locale.getDefault())
    return "Hoy, ${formatter.format(currentDate)}"
}