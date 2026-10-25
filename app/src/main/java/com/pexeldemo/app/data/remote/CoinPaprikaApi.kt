package com.pexeldemo.app.data.remote

import com.pexeldemo.app.data.remote.dto.CoinDto
import com.pexeldemo.app.domain.model.Coin
import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>
}