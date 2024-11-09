package com.devndiplomacy.kmpnotesapp
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.devndiplomacy.kmpnotesapp.storage.NotesDataBase


class IOSSqlFactory : ISqlFactory {
    override fun createDriver(): SqlDriver {
        return NativeSqliteDriver(NotesDataBase.Schema, "notes.db")
    }
}

actual fun getSqlFactory():ISqlFactory = IOSSqlFactory()