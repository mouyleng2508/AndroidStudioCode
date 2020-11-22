package com.example.share_preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var pref: MyPref
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pref = MyPref(this@MainActivity)

        var currentScore = pref.getScore()
        score.text = "Your Score is $currentScore"
        currentScore++
        pref.setScore(currentScore)
    }

}
