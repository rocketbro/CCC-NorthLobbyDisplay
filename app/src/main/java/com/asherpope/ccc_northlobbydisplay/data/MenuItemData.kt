package com.asherpope.ccc_northlobbydisplay.data

import androidx.compose.ui.graphics.painter.Painter

data class MenuItemData(
    val label: String,
    val resource: Painter,
    val contentDescription: String,
    val navRoute: String,
    val enterTransitionDelay: Long
)
