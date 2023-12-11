package com.example.appdocbao_kotlin.api

import android.provider.SyncStateContract.Constants
import retrofit2.Retrofit

class RetrofitClient {
    companion object {
        val instances:Retrofit by lazy {
            Retrofit.Builder().baseUrl(Constants.BASE)
        }
    }
}