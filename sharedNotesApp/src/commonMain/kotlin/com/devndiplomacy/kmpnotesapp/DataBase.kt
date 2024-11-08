package com.devndiplomacy.kmpnotesapp
import com.devndiplomacy.kmpnotesapp.storage.NotesDataBase

internal class DataBase(iSqlFactory: ISqlFactory) {

    private val database = NotesDataBase(iSqlFactory.createDriver())
    private val dbQuery = database.notesDataBaseQueries



    fun createNote(
        title: String,
        body: String,
        createdAt: Long,
        updatedAt: Long
    ) {

        dbQuery.transaction {
            dbQuery.insertNote(
                title, body, createdAt, updatedAt
            )
        }

        getCreatedNote()
    }

    private fun getCreatedNote(){
       val d=  dbQuery.selectAllNotesInfo()
       println("List elements-----> ${d.executeAsList()}")
    }
}