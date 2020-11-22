package com.example.usingintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    fun startNew (view: View)
//    {
//        var intent = Intent (packageContext ; this ; MainActivity2:: class.java )
//
//        var name = editText.text.toString()
////        intent.putExtra ("xyz",username)
////        intent.putExtra ("age",20)
//
//        var bundle = Bundle()
//
//        bundle.putString("user_name",name)
//        bundle.putString("school","KIT")
//
//        intent.putExtras(bundle)
//
//        startActivity(intent)
//    }
}
