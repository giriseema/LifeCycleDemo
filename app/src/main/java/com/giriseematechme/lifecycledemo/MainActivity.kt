package com.giriseematechme.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = this::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"Activity onResume method")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"Activity onStart method")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"Activity onRestart method")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"Activity onPause method")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"Activity onStop method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"Activity onDestroy method")
    }
}
