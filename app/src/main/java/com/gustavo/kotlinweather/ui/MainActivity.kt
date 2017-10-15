package com.gustavo.kotlinweather.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.gustavo.kotlinweather.R
import com.gustavo.kotlinweather.data.ForecastRequest
import com.gustavo.kotlinweather.domain.commands.RequestForecastCommand
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forecastList: RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)

        val zipcode: String = "94043"

        doAsync {
            val result = RequestForecastCommand(zipcode).execute()
            uiThread {
                forecastList.adapter = ForecastListAdapter(result)
            }

        }

    }

    fun niceToast(message: String, tag: String = MainActivity::class.java.simpleName,
                  length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, "[$tag]  $message", length).show()
    }


}
