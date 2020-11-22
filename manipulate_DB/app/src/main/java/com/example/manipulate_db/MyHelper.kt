package com.example.manipulate_db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DB_NAME = "StaffDb"
val TABLE_NAME = "Staff"
var COL1 = "city"
var COL2 = "sname"
class MyHelper(context: Context):SQLiteOpenHelper(context, DB_NAME,null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var create_table = "create table " + "$TABLE_NAME ($COL1 varchar(250), $COL2 varchar(250))"
        p0?.execSQL(create_table)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int)
    {}
    fun insertData(dto:Staff):Long{
        var cv = ContentValues()
        cv.put(COL1,dto.city)
        cv.put(COL2,dto.sname)

        var db = this.writableDatabase
        var res = db.insert(TABLE_NAME,null,cv)
        return res
    }
    fun readRecord():ArrayList<Staff>{
        var list = ArrayList<Staff>()
        var db = this.readableDatabase
        var c = db.rawQuery("select * from $TABLE_NAME",null) // It will return cursion

        if(c!=null){
            if(c.moveToFirst())
            {
                do{
                    var city = c.getString(c.getColumnIndex(COL1))
                    var sname = c.getString(c.getColumnIndex(COL2))
                    var s = Staff(city,sname)
                    list.add(s)
                }while(c.moveToNext())
            }
        }
        return list
    }

}