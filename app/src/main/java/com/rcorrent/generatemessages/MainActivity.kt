package com.rcorrent.generatemessages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.rcorrent.generatemessages.R.id.tvDisplay
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    val phrases = arrayOf(
            "Life is about making an impact, not making an income. --Kevin Kruse",
            "Whatever the mind of man can conceive and believe, it can achieve. --Napoleon Hill",
            "Strive not to be a success, but rather to be of value. --Albert Einstein",
            "Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference. --Robert Frost",
            "I attribute my success to this: I never gave or took any excuse. --Florence Nightingale",
            "You miss 100% of the shots you don’t take. --Wayne Gretzky",
            "Every strike brings me closer to the next home run. --Babe Ruth",
            "We become what we think about.--Earl Nightingale",
            "I've missed more than 9000 shots in my career. I've lost almost 300 games. " +
                    "26 times I've been trusted to take the game winning shot and missed. " +
                    "I've failed over and over and over again in my life. " +
                    "And that is why I succeed. --Michael Jordan"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById<TextView>(tvDisplay)
    }

    fun generateMessages(view: View){
        Toast.makeText(this, "Clicked!!", Toast.LENGTH_SHORT).show()

        val totalPhrases = phrases.size

        text.text = phrases[Random().nextInt(totalPhrases)]

    }
}
