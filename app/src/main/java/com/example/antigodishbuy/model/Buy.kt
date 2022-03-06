package com.example.antigodishbuy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Buy(
    @StringRes val stringResourceId1: Int,
    @StringRes val stringResourceId2: Int,
    @DrawableRes val imageResourceId: Int
    )
