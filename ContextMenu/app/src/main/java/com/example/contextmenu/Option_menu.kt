package com.example.contextmenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Option_menu : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.op1 -> {
                Toast.makeText(this, "Pizza", Toast.LENGTH_LONG).show()
            }
            R.id.op2 -> {
                Toast.makeText(this, "Burger", Toast.LENGTH_LONG).show()
            }
            R.id.op3 -> {
                Toast.makeText(this, "Chicken", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
