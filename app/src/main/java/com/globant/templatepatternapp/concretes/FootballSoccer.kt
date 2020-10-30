package com.globant.templatepatternapp.concretes

import android.widget.TextView
import com.globant.templatepatternapp.abstracts.Game

class FootballSoccer : Game() {
    override fun endPlay(textView: TextView) {
        println("Football Game Finished!")
        textView.text = textView.text.toString() + "\n Football Game Finished!"
    }

    override fun initialize(textView: TextView) {
        println("Football Game Initialized! Start playing.")
        textView.text = textView.text.toString() + "\n\n Football Game Initialized! Start playing."
    }

    override fun halftime(textView: TextView) {
        println("Football Game Halftime")
        textView.text = textView.text.toString() + "\n Football Game Halftime"
    }
}