package com.example.manipulate_db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener{
            var city:String = city.text.toString()
            var sname:String = name.text.toString()

            var dto1 = Staff(city, sname)
            var helper = MyHelper(this)
            var res = helper.insertData(dto1)
            if(res==-1.toLong()){
                Toast.makeText(this,"Registeration failed...",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Registeration Success at row $res...",Toast.LENGTH_LONG).show()
            }
        }
        viewData.setOnClickListener {
            var db = MyHelper(this)
            var list = db.readRecord()
            var str = " "
            for(i in list){
                str+=i.city+":"+i.sname+"\n"
            }
            tv.text = str
        }
    }
}
