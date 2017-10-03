package com.gustavo.kotlinweather.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.gustavo.kotlinweather.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
    }

    fun niceToast(message: String, tag: String = MainActivity::class.java.simpleName,
                  length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, "[$tag]  $message", length).show()
    }


}
