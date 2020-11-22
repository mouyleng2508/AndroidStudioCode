package com.example.radiobuttonexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       button.setOnClickListener {
           var sel = group.checkedRadioButtonId
           when (sel)
           {
               R.id.op1 -> {
                   Toast.makeText(this,"Option 1",Toast.LENGTH_LONG).show()
               }
               R.id.op2 -> {
                   Toast.makeText(this,"Option 2",Toast.LENGTH_LONG).show()
               }
               R.id.op3 -> {
                   Toast.makeText(this,"Option 3",Toast.LENGTH_LONG).show()
               }
           }
       }
    }
}
