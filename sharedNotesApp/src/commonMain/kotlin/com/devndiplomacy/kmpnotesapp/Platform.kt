package com.devndiplomacy.kmpnotesapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform