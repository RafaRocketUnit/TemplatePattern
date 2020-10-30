package com.globant.templatepatternapp.concretes

import android.widget.TextView
import com.globant.templatepatternapp.abstracts.Game

class MountainBikeRacing: Game() {
    override fun initialize(textView: TextView) {
        textView.text = textView.text.toString() + "\n\n MountainBike Race Started!"
    }

    override fun halftime(textView: TextView) {
        /*No Op*/
    }

    override fun endPlay(textView: TextView) {
        textView.text = textView.text.toString() + "\n MountainBike Race Finished!"
    }
}