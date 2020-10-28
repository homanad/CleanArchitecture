package com.android.domain.usecase

import com.android.domain.common.usecase.SingleUseCaseWithParam
import com.android.domain.entity.DummyEntity
import com.android.domain.repository.DummyRepository
import io.reactivex.Scheduler
import io.reactivex.Single

class DummySingleUseCase(
    private val dummyRepository: DummyRepository,
    executorThread: Scheduler,
    uiThread: Scheduler
) : SingleUseCaseWithParam<DummyEntity, String>(executorThread, uiThread) {

    override fun create(param: String): Single<DummyEntity> = dummyRepository.dummySingle()
}