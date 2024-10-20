package com.sabirapps.jotdown.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Note::class],
    version = 1
)
abstract class NotesDB: RoomDatabase(){
    abstract val dao: NoteDao
}