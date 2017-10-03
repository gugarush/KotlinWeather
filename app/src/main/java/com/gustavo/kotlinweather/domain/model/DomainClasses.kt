package com.gustavo.kotlinweather.domain.model



/**
 * Created by gugarush on 03/10/2017.
 */
data class ForecastList(val id: Long, val city: String, val coutry: String,
                        val dailyForecast: List<Forecast>) {

    val size: Int
    get() = dailyForecast.size

    operator fun get(position: Int) = dailyForecast[position]

}

data class Forecast(val id: Long, val date: Long, val description: String, val high: Int, val low: Int,
                    val iconUrl: String)