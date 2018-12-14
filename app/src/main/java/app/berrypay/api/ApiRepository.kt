package app.berrypay.api

import app.berrypay.service.UserAccountService
import app.berrypay.view.BaseView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRepository (
    private val baseView : BaseView
) {


    fun createLoginService(): UserAccountService {
        baseView.showLoading()
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BerryPayBaseUrl.baseUrl())
            .build()
        baseView.hideLoading()
        return retrofit.create(UserAccountService::class.java)
    }
}