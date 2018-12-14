package app.berrypay.api

import app.berrypay.BuildConfig
import app.berrypay.service.UserAccountService

object BerryPayBaseUrl{

    fun baseUrl() = BuildConfig.BASE_URL

    val userAccountServiceApi : UserAccountService
        get() = RetrofitClient.getClient(baseUrl())!!.create(UserAccountService::class.java)
}