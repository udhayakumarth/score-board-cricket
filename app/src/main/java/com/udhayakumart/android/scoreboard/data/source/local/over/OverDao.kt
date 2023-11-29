package com.udhayakumart.android.scoreboard.data.source.local.over

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface OverDao {
    @Insert
    suspend fun insert(entity: OverEntity)

    @Query("SELECT * FROM over")
    fun getAllOvers(): List<OverEntity>
}