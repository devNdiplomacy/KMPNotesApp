package com.devndiplomacy.kmpnotesapp
import app.cash.sqldelight.db.SqlDriver

interface ISqlFactory {
    fun createDriver(): SqlDriver
}

expect fun getSqlFactory(): ISqlFactory

expect object AppContext
