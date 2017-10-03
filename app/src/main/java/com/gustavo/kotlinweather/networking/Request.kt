package com.gustavo.kotlinweather.networking

import android.util.Log
import java.net.URL

/**
 * Created by gugarush on 03/10/2017.
 */
class Request(private val url: String) {
    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d("gofc", forecastJsonStr)
    }
}