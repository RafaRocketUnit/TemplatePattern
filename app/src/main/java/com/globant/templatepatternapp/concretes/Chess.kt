package com.globant.templatepatternapp.concretes

import android.widget.TextView
import com.globant.templatepatternapp.abstracts.Game

class Chess : Game() {
    override fun endPlay(textView: TextView) {
        println("Check mate")
        textView.text = textView.text.toString() + "\n Chess Game: Check mate"
    }

    override fun initialize(textView: TextView) {
        println("Chess Game Starts... First movement.")
        textView.text = textView.text.toString() + "\n\n Chess Game Starts... First movement."
    }

    override fun halftime(textView: TextView) {
        /* No halftime */
    }
}