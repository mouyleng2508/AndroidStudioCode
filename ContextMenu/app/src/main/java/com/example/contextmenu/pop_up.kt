package com.example.contextmenu

import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class pop_up : AppCompatActivity() {
    //PopupMenu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        action.setOnClickListener {
            var popupMenu = PopupMenu(this, it)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.op1 -> {
                        Toast.makeText(this, "Option 1", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.op2 -> {
                        Toast.makeText(this, "Option 2", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.op3 -> {
                        Toast.makeText(this, "Option 3", Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> {
                        false
                    }
                }
            }
            popupMenu.inflate(R.menu.my_menu)
            popupMenu.show()
        }
    }
}