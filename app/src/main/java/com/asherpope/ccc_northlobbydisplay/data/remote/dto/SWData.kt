package com.asherpope.ccc_northlobbydisplay.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class SWData(
    val records: List<SWRecord>
)