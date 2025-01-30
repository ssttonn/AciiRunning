package com.astrotify.aciirunning.repositories

import com.astrotify.aciirunning.db.RunRecord
import com.astrotify.aciirunning.db.RunRecordDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runRecordDao: RunRecordDao
) {
    suspend fun insertRunRecord(runRecord: RunRecord) = runRecordDao.insertRunRecord(runRecord)

    suspend fun deleteRunRecord(runRecord: RunRecord) = runRecordDao.deleteRun(runRecord)

    fun getAllRunRecordsSortedByDate() = runRecordDao.getAllRunRecordsSortedByDate()

    fun getAllRunRecordsSortedByDistance() = runRecordDao.getAllRunRecordsSortedByDistanceInMeters()

    fun getAlRunRecordsSortedByTimeInMillis() = runRecordDao.getAllRunRecordsSortedByTimeInMillis()

    fun getAllRunRecordsSortedByAvgSpeed() = runRecordDao.getAllRunRecordsSortedByAvgSpeed()

    fun getAllRunRecordsSortedByCaloriesBurned() = runRecordDao.getAllRunRecordsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runRecordDao.getAverageSpeed()

    fun getTotalDistance() = runRecordDao.getTotalDistanceTraveled()

    fun getTotalCaloriesBurned() = runRecordDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runRecordDao.getTotalTimeInMillis()
}