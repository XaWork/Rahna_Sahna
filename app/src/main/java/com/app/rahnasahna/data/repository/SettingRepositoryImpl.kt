package com.app.rahnasahna.data.repository

import android.util.Log
import com.app.rahnasahna.data.remote.SettingApi
import com.app.rahnasahna.domain.model.SettingModel
import com.app.rahnasahna.domain.repository.SettingRepository
import com.app.rahnasahna.util.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingRepositoryImpl @Inject constructor(
    private val api: SettingApi
) : SettingRepository {

    override suspend fun settings(): Resource<SettingModel> {
        return try {
            val response = api.settings()
            Resource.Success(data = response)
        } catch (throwable: Throwable) {
            Log.e("exception", "safeapicall: $throwable")
            when (throwable) {
                is IOException -> {
                    Resource.Error(
                        "Try again"
                    )
                }
                is HttpException -> {
                    Resource.Error(
                        "Try again"
                    )
                }
                else -> {
                    Resource.Error(
                        "Try again"
                    )
                }
            }
        }
    }
}