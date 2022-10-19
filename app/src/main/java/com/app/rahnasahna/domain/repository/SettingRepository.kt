package com.app.rahnasahna.domain.repository

import com.app.rahnasahna.domain.model.SettingModel
import com.app.rahnasahna.util.Resource

interface SettingRepository {

    suspend fun settings(): Resource<SettingModel>
}