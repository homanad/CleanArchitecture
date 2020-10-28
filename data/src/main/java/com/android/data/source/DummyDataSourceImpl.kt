package com.android.data.source

import com.android.domain.entity.DummyEntity
import io.reactivex.Observable
import io.reactivex.Single

class DummyDataSourceImpl : DummyDataSource {

    override fun dummySingle(): Single<DummyEntity> {
        TODO("Not yet implemented")
    }

    override fun dummyObservable(): Observable<DummyEntity> {
        TODO("Not yet implemented")
    }
}