package com.android.domain.common.usecase

import io.reactivex.Observable
import io.reactivex.Scheduler

abstract class ObservableUseCase<T>(
    private val executorThread: Scheduler,
    private val uiThread: Scheduler
) {

    operator fun invoke(): Observable<T> {
        return create().subscribeOn(executorThread).subscribeOn(uiThread)
    }

    protected abstract fun create(): Observable<T>
}