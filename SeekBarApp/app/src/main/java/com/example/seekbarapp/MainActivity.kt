package com.example.seekbarapp

import android.graphics.Color
import android.net.sip.SipAudioCall
import android.net.sip.SipSession
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 
        alpha.max = 255
        colorRed.max = 255
        colorGreen.max = 255
        colorBlue.max = 255

        class Inner : SeekBar.OnSeekBarChangeListener {
            var alCol = 0
            var redCol = 0
            var greenCol = 0
            var blueCol = 0
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when (p0?.id) {
                    R.id.alpha -> {
                        alCol = p1
                    }
                    R.id.colorRed -> {
                        redCol = p1
                    }
                    R.id.colorGreen -> {
                        greenCol = p1
                    }
                    R.id.colorBlue -> {
                        blueCol = p1
                    }
                }
             var bgCol = Color.argb(alCol,redCol,greenCol,blueCol)
                page.setBackgroundColor(bgCol)
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }
        var Listener = Inner()
        alpha.setOnSeekBarChangeListener(Listener)
        colorRed.setOnSeekBarChangeListener(Listener)
        colorGreen.setOnSeekBarChangeListener(Listener)
        colorBlue.setOnSeekBarChangeListener(Listener)
    }
}


//        alpha.max = 1000
//        alpha.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
//            override fun onProgressChanged(p0: SeekBar?,progress : Int, p2: Boolean) {
//                tv.text = "Currently at Position : $progress"
//            }
//
//            override fun onStartTrackingTouch(p0: SeekBar?) {
//                tv.text = "Starting position ${p0?.progress}"
//            }
//
//            override fun onStopTrackingTouch(p0: SeekBar?) {
//                tv.text = "Ended at ${p0?.progress}"
//            }
//        })
//    }
//}
