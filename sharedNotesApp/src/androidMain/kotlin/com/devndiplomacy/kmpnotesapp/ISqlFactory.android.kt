package com.devndiplomacy.kmpnotesapp
import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.devndiplomacy.kmpnotesapp.storage.NotesDataBase

class AndroidSqlFactory(private val context: Context): ISqlFactory {
    override fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(NotesDataBase.Schema, context, "notes.db")
    }
}


actual fun getSqlFactory():ISqlFactory = AndroidSqlFactory(AppContext.getAndroidContext())