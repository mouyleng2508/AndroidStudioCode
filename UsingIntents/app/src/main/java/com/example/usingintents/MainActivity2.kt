package com.example.usingintents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
    }
//        var userName = intent.getStringExtra("xyz")
//        var age = intent.getIntExtra("age" , 0)
//        textView.text = "Welcome $userName and your age is $age"
//
//        var bundle = intent.extras
//        var name = bundle?.get("User_name")
//        var school = bundle?.get("School")
//
//        details.text = "Name : $name : School : $school"

}