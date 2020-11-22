package com.example.myapplication1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate.setOnClickListener {

        }
        var yob = editText2.text.toString().toInt()
        var cyear = Calendar.getInstance().get(Calendar.YEAR)
        var age = cyear - yoiew3.text.toString()}: $age"

//        var dateOB = editText2.t
//        textView3.text = "${textVext.toString()
//        var arr = dateOB.split("/")
//        textView3.text = "${arr[0]}:${arr[1]}:${arr[2]}"
    }
}
