package com.example.share_preference

import android.content.Context

class MyPref (context: Context){
    val SCORE = "myscore"
    val PREF_NAME = "mypref"
    var updatedScore = 0

    var pref = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE)

    fun getScore():Int {
        return pref.getInt(SCORE,0)
    }

    fun setScore(tempScore: Int){
        var editor = pref.edit()
        editor.putInt(SCORE,updatedScore)
        editor.apply()
    }

}