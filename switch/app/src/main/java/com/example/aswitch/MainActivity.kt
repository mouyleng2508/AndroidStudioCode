package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1.setOnClickListener() {
            if (switch1.isChecked)
                Toast.makeText(this,"Open",Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"Close",Toast.LENGTH_LONG).show()
        }
    }
}
