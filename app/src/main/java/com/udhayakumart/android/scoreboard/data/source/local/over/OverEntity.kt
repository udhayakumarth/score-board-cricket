package com.udhayakumart.android.scoreboard.data.source.local.over

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "over")
data class OverEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long=0,
    val no: Int,
    val isCompleted: Boolean
)