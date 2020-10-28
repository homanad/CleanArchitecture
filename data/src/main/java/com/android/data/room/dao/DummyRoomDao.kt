package com.android.data.room.dao

import androidx.room.Dao
import com.android.data.room.entity.DummyRoomEntity

@Dao
abstract class DummyRoomDao : BaseDao<DummyRoomEntity> {
}