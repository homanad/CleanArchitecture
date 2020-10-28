package com.android.domain.repository

import com.android.domain.entity.DummyEntity
import io.reactivex.Observable
import io.reactivex.Single

interface DummyRepository {

    fun dummySingle(): Single<DummyEntity>

    fun dummyObservable(): Observable<DummyEntity>
}