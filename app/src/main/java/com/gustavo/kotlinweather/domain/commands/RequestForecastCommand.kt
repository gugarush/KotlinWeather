package com.gustavo.kotlinweather.domain.commands

import com.gustavo.kotlinweather.data.ForecastRequest
import com.gustavo.kotlinweather.domain.mappers.ForecastDataMapper
import com.gustavo.kotlinweather.domain.model.ForecastList

/**
 * Created by gugarush on 15/10/2017.
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
            val forecastRequest = ForecastRequest(zipCode)
            return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}