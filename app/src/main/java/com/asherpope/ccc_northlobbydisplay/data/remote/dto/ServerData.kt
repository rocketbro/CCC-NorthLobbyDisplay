package com.asherpope.ccc_northlobbydisplay.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class ServerData(
    val tables: Tables = Tables()
)

@Serializable
data class Tables(
    val swData: SWData = SWData(listOf()),
    val ciData: CIData = CIData(listOf())
)