package com.astrotify.aciirunning.di

import android.content.Context
import androidx.room.Room
import com.astrotify.aciirunning.db.RunRecordDatabase
import com.astrotify.aciirunning.util.Constants.RUN_RECORD_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideRunningRecordsDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        RunRecordDatabase::class.java,
        RUN_RECORD_DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunRecordsDao(db: RunRecordDatabase) = db.getRunRecordDao()
}