package com.chrisabbod.data_usa.model

import com.google.gson.annotations.SerializedName

data class BaseJSONResponse(
    @SerializedName("data")
    val data: List<RaceData>
)

data class RaceData(
    @SerializedName("Race")
    val race: String,
    @SerializedName("Ethnicity")
    val ethnicity: String,
    @SerializedName("ID Year")
    val year: Int,
    @SerializedName("Hispanic Population")
    val hispanicPopulation: Int,
    @SerializedName("Geography")
    val  geography: String
)