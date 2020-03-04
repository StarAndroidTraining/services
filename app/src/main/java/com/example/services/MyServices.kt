package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService: Service(){

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Services Started", Toast.LENGTH_LONG).show()
        return START_STICKY //tells the system to create a fresh copy of the service, when sufficient memory is available, after it recovers from low memory. Here you will lose the results that might have computed before.

    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show()
    }
}