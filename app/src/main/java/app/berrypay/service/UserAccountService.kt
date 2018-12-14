package app.berrypay.service

import app.berrypay.model.Accounts
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UserAccountService {
    @GET("employee/employees/login")
    fun login(@Query("username") username : String,
              @Query("password") password : String) : Call<Accounts>

}