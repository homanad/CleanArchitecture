package com.android.data.room.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(obj: T): Long

    @Insert
    fun insert(vararg obj: T)

    @Update
    fun update(obj: T): Int

    @Delete
    fun delete(obj: T): Int
}