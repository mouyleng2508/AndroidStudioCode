package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main1.*

class MainActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeImage(view: View)
    {
        var imgView = view as ImageView

        when(imgView.id)
        {
            R.id.button1 ->
            {
                button1.visibility = View.GONE
                button2.visibility = View.VISIBLE
            }
            R.id.button2 ->
            {
                button2.visibility = View.GONE
                button1.visibility = View.VISIBLE
            }
        }
    }
}