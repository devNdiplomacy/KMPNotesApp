package com.devndiplomacy.kmpnotesapp

import android.content.Context

actual object AppContext {

    lateinit var context: Context

    fun setC(context: Context){
        this.context = context
    }

    fun getContext1() = this.context

}