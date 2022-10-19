package com.app.rahnasahna.data.remote

import com.app.rahnasahna.domain.model.SettingModel
import retrofit2.http.GET

interface SettingApi  {

    @GET("settings")
    suspend fun settings(): SettingModel
}