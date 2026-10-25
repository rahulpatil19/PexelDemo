package com.pexeldemo.app.presentation.coin_list

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.pexeldemo.app.R
import com.pexeldemo.app.domain.model.Coin

@Composable
fun CoinList(
    navController: NavController,
    viewModel: CoinListViewModel = hiltViewModel()) {

    val state = viewModel.state.value

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(state.coins) { index, coin ->
            CoinRow(coin = coin)
        }
    }
}

@Composable
fun CoinRow(coin: Coin) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .background(Color.LightGray)) {

        Image(painterResource(R.drawable.ic_launcher_background), null)
        Spacer(Modifier.width(8.dp))
        Text(text = coin.name, style = TextStyle(color = Color.Cyan, fontSize = 14.sp))
    }
}