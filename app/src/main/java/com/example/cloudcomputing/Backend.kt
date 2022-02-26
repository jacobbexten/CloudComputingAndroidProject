package com.example.cloudcomputing

import android.content.Context
import android.util.Log
import com.amplifyframework.AmplifyException
import com.amplifyframework.core.Amplify

object Backend {

    private const val TAG = "Backend"

    fun initialize(applicationContext: Context) : Backend {
        try {
            Amplify.configure(applicationContext)
            Log.i(TAG, "Initialized Amplify")
        } catch (e: AmplifyException) {
            Log.e(TAG, "Could not initialize Amplify", e)
        }
        return this
    }
}