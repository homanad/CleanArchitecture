package com.android.baseproject.di

import com.android.data.repository.DummyRepositoryImpl
import com.android.data.source.DummyDataSourceImpl
import com.android.domain.usecase.DummyObservableUseCase
import com.android.domain.usecase.DummySingleUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object Injector {

    private val executorThread by lazy {
        Schedulers.io()
    }

    private val uiThread by lazy {
        AndroidSchedulers.mainThread()
    }

    private val dummyDataSource by lazy {
        DummyDataSourceImpl()
    }

    private val dummyRepository by lazy {
        DummyRepositoryImpl(dummyDataSource)
    }

    @Synchronized
    fun getDummySingleUseCase(): DummySingleUseCase {
        return DummySingleUseCase(dummyRepository, executorThread, uiThread)
    }

    @Synchronized
    fun getDummyObservableUseCase(): DummyObservableUseCase {
        return DummyObservableUseCase(dummyRepository, executorThread, uiThread)
    }

}