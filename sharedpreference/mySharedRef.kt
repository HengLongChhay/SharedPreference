package com.chhay.sharedpreference

import android.content.Context

class mySharedRef(context: Context) {
    val ref_name = "myref"
    val Score = "myscore"
    var pref = context.getSharedPreferences(ref_name, Context.MODE_PRIVATE)

    fun getScore():Int{
        return pref.getInt(Score, 0)
    }

    fun setScore(updatedScore:Int){
        var editor = pref.edit()
        editor.putInt(Score, updatedScore)
        editor.apply()
    }
}