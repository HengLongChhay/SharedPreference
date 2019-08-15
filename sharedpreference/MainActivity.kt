package com.chhay.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var pref : mySharedRef
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pref = mySharedRef(this@MainActivity)
        var currentScore = pref.getScore()
        currentScore++
        pref.setScore(currentScore)
        textView_nb.text = currentScore.toString()
    }
}
