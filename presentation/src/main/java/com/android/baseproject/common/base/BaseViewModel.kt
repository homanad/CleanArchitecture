package com.android.baseproject.common.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel : ViewModel() {

    val disposables = CompositeDisposable()

    val eventLoading = MutableLiveData<Event<Boolean>>()

    val eventMessage = MutableLiveData<Event<String>>()

    override fun onCleared() {
        disposables.clear()
        super.onCleared()
    }
}