package com.chrisabbod.data_usa

import com.chrisabbod.data_usa.model.StateDataResponse
import retrofit2.http.GET

interface DataUsaAPI {

    @GET("data?Geography=04000US26&drilldowns=Race,Ethnicity&measures=Hispanic%20Population,Hispanic%20Population%20Moe")
    suspend fun getRaceAndEthnicity(): StateDataResponse

}