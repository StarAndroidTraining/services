package com.example.p8q1servicesdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.services.MyService
import com.example.services.R

class MainActivity : AppCompatActivity() {

    var msg = "Android"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(msg, "The onCreate Event")
    }
    fun startService(view: View){
        startService(Intent(baseContext, MyService::class.java))
        Log.d(msg, "You just clicked Start Service Event")
    }

    fun stopService(view:View){
        stopService(Intent(baseContext,MyService::class.java))
        Log.d(msg, "You just clicked Stop Service Event")
    }
}
