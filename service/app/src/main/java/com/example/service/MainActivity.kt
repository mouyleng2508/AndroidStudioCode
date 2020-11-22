package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun myMusic(v:View) {
        var i = Intent (this,MyMusicService::class.java)
        when(v.id) {
            R.id.start -> {
                startService(i)
            }
            R.id.stop -> {
                stopService(i)
            }
            R.id.startNew -> {
                var j = Intent(this,Main2Activity::class.java)
                startActivity(j)
            }
        }
    }
}
