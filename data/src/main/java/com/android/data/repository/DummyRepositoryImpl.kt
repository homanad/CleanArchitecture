package com.android.data.repository

import com.android.data.source.DummyDataSource
import com.android.domain.entity.DummyEntity
import com.android.domain.repository.DummyRepository
import io.reactivex.Observable
import io.reactivex.Single

class DummyRepositoryImpl(
    private val dummyDataSource: DummyDataSource
) : DummyRepository {

    override fun dummySingle(): Single<DummyEntity> {
        return dummyDataSource.dummySingle()
    }

    override fun dummyObservable(): Observable<DummyEntity> {
        return dummyDataSource.dummyObservable()
    }

}