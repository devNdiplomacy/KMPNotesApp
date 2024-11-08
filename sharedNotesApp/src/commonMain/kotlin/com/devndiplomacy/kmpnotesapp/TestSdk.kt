package com.devndiplomacy.kmpnotesapp


class TestSdk(val iSqlFactory:ISqlFactory) {

    fun startTesting(){
        val d = DataBase(iSqlFactory)
        d.createNote("Aryan","daaaece",1223,31341)
    }
}