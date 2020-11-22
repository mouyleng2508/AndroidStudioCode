 package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonClicked1(view:View)
    {
        //Toast.makeText(this,"Button 1 Clicked...", Toast.LENGTH_LONG).show()
        var button = view as Button
        when(button.id)
        {
            R.id.button1 -> {
               // Toast.makeText(this,"You clicked Button 1", Toast.LENGTH_LONG).show()
                var i = Intent(this,Main2Activity::class.java)
                startActivity(i)
            }
            R.id.button2 -> Toast.makeText(this,"You clicked Button 2", Toast.LENGTH_LONG).show()
            else -> Toast.makeText(this,"Invalid Selection...", Toast.LENGTH_LONG)
        }
    }
/*
     fun buttonClicked2(view:View)
     {
         Toast.makeText(this,"Button 2 Clicked...", Toast.LENGTH_LONG).show()
     }
     */
}
