package com.example.antigodishbuy.data

import com.example.antigodishbuy.R
import com.example.antigodishbuy.model.Buy

class Datasource {

    fun loadDish(): List<Buy>{
        return listOf<Buy>(
            Buy(R.string.dish1, R.string.dish1_price, R.drawable.chickparm),
            Buy(R.string.dish2, R.string.dish2_price, R.drawable.beefravi),
            Buy(R.string.dish3, R.string.dish3_price, R.drawable.beefstrog),
            Buy(R.string.dish4, R.string.dish4_price, R.drawable.bakesalm),
            Buy(R.string.dish5, R.string.dish5_price, R.drawable.chicktikk),
            Buy(R.string.dish6, R.string.dish6_price, R.drawable.sheppies),
            Buy(R.string.dish7, R.string.dish7_price, R.drawable.smokribs),
            Buy(R.string.dish8, R.string.dish8_price, R.drawable.chickmein),
            Buy(R.string.dish9, R.string.dish9_price, R.drawable.crabcake),
            Buy(R.string.dish10, R.string.dish10_price, R.drawable.schechick)
        )
    }
}