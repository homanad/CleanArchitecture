package com.android.baseproject.vm

import com.android.baseproject.common.base.BaseViewModel
import com.android.domain.usecase.DummyObservableUseCase
import com.android.domain.usecase.DummySingleUseCase

class MainViewModel(
    private val dummySingleUseCase: DummySingleUseCase,
    private val dummyObservableUseCase: DummyObservableUseCase
) : BaseViewModel() {

    fun singleeeeeeeee() {
        disposables.add(
            dummySingleUseCase("dumyyyyyyy").subscribe({}, {})
        )
    }

}