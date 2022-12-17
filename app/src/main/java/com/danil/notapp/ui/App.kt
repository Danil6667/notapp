package com.danil.notapp.ui

import android.app.Application
import com.danil.notapp.ui.utils.PreferenceHelper

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.unit(this)
    }
}