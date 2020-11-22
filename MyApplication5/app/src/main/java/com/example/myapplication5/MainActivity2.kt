package com.example.myapplication5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun goHome(v:View){
        var i=Intent()
        var username=editText.text.toString()

        i.putExtra("Data", username)
        setResult(Activity.RESULT_OK,i)
        finish()
    }
}
