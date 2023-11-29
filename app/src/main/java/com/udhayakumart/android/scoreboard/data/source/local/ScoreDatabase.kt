package com.udhayakumart.android.scoreboard.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.udhayakumart.android.scoreboard.data.source.local.over.OverDao
import com.udhayakumart.android.scoreboard.data.source.local.over.OverEntity
import com.udhayakumart.android.scoreboard.data.source.local.wicket.WicketDao
import com.udhayakumart.android.scoreboard.data.source.local.wicket.WicketEntity

@Database(entities = [OverEntity::class,WicketEntity::class], version = 1, exportSchema = false )
abstract class ScoreDatabase: RoomDatabase() {
    abstract fun overDao(): OverDao
    abstract fun wicketDao(): WicketDao

    companion object{
        @Volatile
        var INSTANCE:ScoreDatabase? = null
        fun getDatabase(context: Context):ScoreDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context,
                    ScoreDatabase::class.java,
                    "scoreboard_db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}