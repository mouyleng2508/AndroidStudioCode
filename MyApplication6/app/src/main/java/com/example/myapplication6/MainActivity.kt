package com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.op1 -> {
                Toast.makeText(this,"You selected Burger King", Toast.LENGTH_SHORT).show()
            }
            R.id.op2 -> {
                Toast.makeText(this,"You selected Mcdonald", Toast.LENGTH_SHORT).show()
            }
            R.id.op3 -> {
                Toast.makeText(this,"You selected Lotteria", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
