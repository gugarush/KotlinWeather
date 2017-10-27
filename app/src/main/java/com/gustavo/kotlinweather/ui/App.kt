package com.gustavo.kotlinweather.ui

import android.app.Application
import com.gustavo.kotlinweather.ui.utils.DelegatesExt

/**
 * Created by gustavo on 27/10/17.
 */
    class App : Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
        private set

        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}