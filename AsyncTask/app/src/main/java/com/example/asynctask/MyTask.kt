package com.example.asynctask

import android.content.Context
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MyTask (context: Context,button: Button,progressBar: ProgressBar,textView: TextView) :
    AsyncTask<Void, Int, String>(){
    lateinit var context: Context
    lateinit var button: Button
    lateinit var progressBar: ProgressBar
    lateinit var textView: TextView
    init {
        this.context = context
        this.button = button
        this.progressBar = progressBar
        this.textView = textView
    }
    override fun onPreExecute() {
        super.onPreExecute()
        textView.text = "Preparing for download..." //prepare to execute
        button.isEnabled = false
        Thread.sleep(3000)
    }

    override fun doInBackground(vararg p0: Void?): String { //main task
        for (i in 1..100 step 1){
            Thread.sleep(100)
            publishProgress(i)
        }
        return "Download is completed"
    }

    override fun onProgressUpdate(vararg values: Int?) { //
        var process = values[0]
        textView.text = "$process downloading"
        progressBar.progress = process!!
    }

    override fun onPostExecute(result: String?) {
        textView.text = result
        button.isEnabled = true
    }
}
