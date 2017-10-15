package com.gustavo.kotlinweather.ui

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.gustavo.kotlinweather.domain.model.ForecastList

/**
 * Created by gugarush on 03/10/2017.
 */
class ForecastListAdapter(val weakForecast: ForecastList) :
    RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weakForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int = weakForecast.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}