package com.asherpope.ccc_northlobbydisplay

import android.app.Application

class SLD: Application() {

    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl()
    }
}