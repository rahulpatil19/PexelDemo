package com.pexeldemo.app.data.repository

import com.pexeldemo.app.data.remote.CoinPaprikaApi
import com.pexeldemo.app.data.remote.dto.CoinDto
import com.pexeldemo.app.domain.model.Coin
import com.pexeldemo.app.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(val coinPaprikaApi: CoinPaprikaApi): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return coinPaprikaApi.getCoins()
    }

}