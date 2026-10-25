package com.pexeldemo.app.domain.repository

import com.pexeldemo.app.data.remote.dto.CoinDto
import com.pexeldemo.app.domain.model.Coin

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
}