package com.astrotify.aciirunning.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RunRecordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRunRecord(runRecord: RunRecord)

    @Delete
    suspend fun deleteRun(runRecord: RunRecord)

    @Query("SELECT * FROM run_records ORDER BY timestamp DESC")
    fun getAllRunRecordsSortedByDate(): LiveData<List<RunRecord>>

    @Query("SELECT * FROM run_records ORDER BY timeInMillis DESC")
    fun getAllRunRecordsSortedByTimeInMillis(): LiveData<List<RunRecord>>

    @Query("SELECT * FROM run_records ORDER BY avgSpeedInKMH DESC")
    fun getAllRunRecordsSortedByAvgSpeed(): LiveData<List<RunRecord>>

    @Query("SELECT * FROM run_records ORDER BY caloriesBurned DESC")
    fun getAllRunRecordsSortedByCaloriesBurned(): LiveData<List<RunRecord>>

    @Query("SELECT * FROM run_records ORDER BY distanceInMeters DESC")
    fun getAllRunRecordsSortedByDistanceInMeters(): LiveData<List<RunRecord>>

    @Query("SELECT SUM(timeInMillis) FROM run_records")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM run_records")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) FROM run_records")
    fun getTotalDistanceTraveled(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM RUN_RECORDS")
    fun getAverageSpeed(): LiveData<Float>
}