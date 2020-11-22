package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playVideo()
    }
    fun playVideo(uri:Uri) {
        var mediaPlayer:MediaController? = MediaController(this)
        mediaPlayer?.setAnchorView(videoView)
        videoView.setMediaController(mediaPlayer)
        videoView.setVideoPath("https://converter.savefrom.net/joiner?id=LH57uZUxSKo&v=https%3A%2F%2Fredirector.")
        //videoView.setVideoURI(uri)
        videoView.start()
    }
}
