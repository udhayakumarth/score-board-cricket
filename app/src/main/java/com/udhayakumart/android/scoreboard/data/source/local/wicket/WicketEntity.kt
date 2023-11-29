package com.udhayakumart.android.scoreboard.data.source.local.wicket

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wicket")
data class WicketEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long=0,
    val no: Int,
    val isOut: Boolean
)