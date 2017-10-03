package com.gustavo.kotlinweather.domain.commands

/**
 * Created by gugarush on 03/10/2017.
 */
interface Command<out T> {
    fun execute(): T
}