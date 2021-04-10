package com.tutorial.basicmvvm

import android.app.Application

class App : Application() {
    private lateinit var appExecutors: AppExecutors

    override fun onCreate() {
        super.onCreate()

        appExecutors = AppExecutors()
    }

    fun getDatabase(): AppDatabase = AppDatabase.getDatabase(this, appExecutors)

}