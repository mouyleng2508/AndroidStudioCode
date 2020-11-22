package com.example.usingintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity3_1 : AppCompatActivity() {

    public Button button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3_1)

        button = (Button) findViewById(R.id.button);
        button.setOnSetListener (new View.OnClickListener())
    }
}
