package com.example.contextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //ContextMenu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(tv)
    }
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu, menu)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.op1 -> {
                Toast.makeText(this, "Option1 was selected", Toast.LENGTH_LONG).show()
            }
            R.id.op2 -> {
                Toast.makeText(this, "Option2 was selected", Toast.LENGTH_LONG).show()
            }
            R.id.op3 -> {
                Toast.makeText(this, "Option3 was selected", Toast.LENGTH_LONG).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}


