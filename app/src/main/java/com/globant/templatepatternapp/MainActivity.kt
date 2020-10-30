package com.globant.templatepatternapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.globant.templatepatternapp.concretes.Chess
import com.globant.templatepatternapp.concretes.FootballSoccer
import com.globant.templatepatternapp.concretes.MountainBikeRacing
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.let {
            Chess().play(textView)
            FootballSoccer().play(textView)
            MountainBikeRacing().play(textView)
        }

    }
}