package com.android.data.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.android.data.room.dao.DummyRoomDao
import com.android.data.room.entity.DummyRoomEntity

@Database(entities = [DummyRoomEntity::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

    abstract val dummyRoomDao: DummyRoomDao

    companion object {

        @Volatile
        private var INSTANCE: MyDatabase? = null
        fun getInstance(context: Context): MyDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MyDatabase::class.java,
                        MyDatabase::class.java.name
                    )
//                        .fallbackToDestructiveMigration()
                        .build()
                }
                return instance
            }
        }
    }
}