package com.example.cloudcomputing

import android.app.Application

class CloudComputingApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // initialize Amplify when application is starting
        Backend.initialize(applicationContext)
    }
}