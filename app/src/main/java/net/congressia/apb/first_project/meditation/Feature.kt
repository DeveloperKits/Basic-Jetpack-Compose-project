package net.congressia.apb.first_project.meditation

import androidx.annotation.DrawableRes

data class Feature(
    val tittle: String,
    @DrawableRes val iconId: Int
)

data class BottomMenuContent(
    val tittle: String,
    @DrawableRes val iconId: Int
)
