package com.example.receiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var br:BroadcastReceiver
    lateinit var ifil:IntentFilter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ifil = IntentFilter()
        ifil.addAction(Intent.ACTION_BATTERY_CHANGED)

        br = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Toast.makeText(this@MainActivity,"Battery Change",Toast.LENGTH_LONG).show()
            }
        }
        registerReceiver(br,ifil)

        button.setOnClickListener() {
            var i = Intent(this,MyReceiver::class.java)
            sendBroadcast(i)
        }
    }

    override fun onDestroy() {
        unregisterReceiver(br)
        super.onDestroy()
    }
    }

