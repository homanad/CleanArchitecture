package com.android.data.source

import com.android.domain.entity.DummyEntity
import io.reactivex.Observable
import io.reactivex.Single

interface DummyDataSource {

    fun dummySingle(): Single<DummyEntity>

    fun dummyObservable(): Observable<DummyEntity>
}