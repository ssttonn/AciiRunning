package com.astrotify.aciirunning.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [RunRecord::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunRecordDatabase: RoomDatabase() {
    abstract fun getRunRecordDao(): RunRecordDao
}