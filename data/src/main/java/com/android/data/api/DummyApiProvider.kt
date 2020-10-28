package com.android.data.api

import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object DummyApiProvider {

    fun createNewsApi(baseUrl: String): DummyApi {
        return Retrofit
            .Builder()
            .baseUrl(baseUrl)
//            .client(createOkHttpClient(getLoggingInterceptor(), getHeaderInterceptor(aToken)))
            .client(createOkHttpClient(getLoggingInterceptor()))
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()
            .create(DummyApi::class.java)
    }

    private fun createOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor
//        , headerInterceptor: Interceptor
    ): OkHttpClient {
        return OkHttpClient
            .Builder()
            .addInterceptor(loggingInterceptor)
//            .addInterceptor(headerInterceptor)
            .build()
    }

    private fun getLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().also {
            it.level = HttpLoggingInterceptor.Level.BODY
        }
    }
}