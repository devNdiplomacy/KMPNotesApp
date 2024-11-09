package com.devndiplomacy.kmpnotesapp

import android.content.Context

actual object AppContext {

    lateinit var context: Context

    fun setAndroidContext(context: Context){
        this.context = context
    }

    fun getAndroidContext() = this.context

}