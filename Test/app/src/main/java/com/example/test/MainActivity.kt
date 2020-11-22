package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var yourOrder:String= ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vieworder.setOnClickListener {
            yourOrder = ""
            if (pizza.isChecked) {
                yourOrder += "Pizza\n"
            }
            if (burger.isChecked) {
                yourOrder += "Burger\n"
            }
            if (icecream.isChecked) {
                yourOrder += "Ice-Cream\n"
            }
            Toast.makeText(this,"Your Order\n $yourOrder",Toast.LENGTH_LONG).show()
        }
    }
}
