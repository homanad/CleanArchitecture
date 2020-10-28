package com.android.domain.usecase

import com.android.domain.common.usecase.ObservableUseCase
import com.android.domain.entity.DummyEntity
import com.android.domain.repository.DummyRepository
import io.reactivex.Observable
import io.reactivex.Scheduler

class DummyObservableUseCase(
    private val dummyRepository: DummyRepository,
    executorThread: Scheduler,
    uiThread: Scheduler
) : ObservableUseCase<DummyEntity>(executorThread, uiThread) {

    override fun create(): Observable<DummyEntity> = dummyRepository.dummyObservable()
}