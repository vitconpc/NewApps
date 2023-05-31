package com.vitconpc.newsapplication.ui.api

import android.content.Context
import com.vitconpc.newsapplication.ui.utils.Constants.Companion.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitInstance {

    private fun getHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .readTimeout(30000, TimeUnit.MILLISECONDS)
            .connectTimeout(30000, TimeUnit.MILLISECONDS)
            .writeTimeout(30000, TimeUnit.MILLISECONDS)
            .build()
    }

    fun getRetrofitBuilder(): Retrofit {
       return Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .client(getHttpClient())
           .build()
    }

    inline fun <reified T> getService() : T = getRetrofitBuilder().create(T::class.java)

    val newsService: NewsApi = getRetrofitBuilder().create(NewsApi::class.java)
}
