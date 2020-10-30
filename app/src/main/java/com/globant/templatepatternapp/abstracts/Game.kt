package com.globant.templatepatternapp.abstracts

import android.widget.TextView

abstract class Game {
    abstract fun initialize(textView: TextView)
    abstract fun halftime(textView: TextView)
    abstract fun endPlay(textView: TextView)

    //template method
    fun play(textView: TextView) {

        //initialize the game
        initialize(textView)

        //start game
        halftime(textView)

        //end game
        endPlay(textView)
    }
}