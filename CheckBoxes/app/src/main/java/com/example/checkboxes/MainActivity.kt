package com.example.checkboxes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var yourOrder:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewOrder.setOnClickListener{
            yourOrder=""
            if(pizza.isChecked){
                yourOrder+="Pizza\n"
            }
            if(burger.isChecked){
                yourOrder+="Burger\n"
            }
            if(sushi.isChecked){
                yourOrder+="Sushi\n"
            }
            if(takoyaki.isChecked){
                yourOrder+="Takoyaki\n"
            }
            Toast.makeText(this,"Your orders\n $yourOrder",Toast.LENGTH_LONG).show()
        }
    }
}
