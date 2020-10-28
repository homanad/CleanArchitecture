package com.android.data.api

import com.android.data.data.DummyData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface DummyApi {
    @GET("dummy")
    fun getNews(
        @Query("dummy") dummy: String,
        @Query("dummy2") dummy2: String,
        @Query("dummy3") dummy3: Int,
        @Query("dummy4") dummy4: String
    ): Single<DummyData>
}