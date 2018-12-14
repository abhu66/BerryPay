package app.berrypay.activity.login

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import app.berrypay.R
import app.berrypay.activity.navigation.NavigationActivity
import app.berrypay.api.ApiRepository
import app.berrypay.model.Accounts
import app.berrypay.service.UserAccountService
import app.berrypay.view.BaseView
import kotlinx.android.synthetic.main.login_form.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginActivity : AppCompatActivity(), BaseView {

    private lateinit var mUserAccountApi : ApiRepository
    private var service : UserAccountService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_form)
        init()

        prosessLogin()



    }

    override fun showLoading() {

    }

    override fun hideLoading() {
    }


    private fun prosessLogin(){
        button_login.setOnClickListener {
            service?.login(field_username.text.toString(), field_password.text.toString())
                ?.enqueue(object : Callback<Accounts> {
            override fun onResponse(call: Call<Accounts>, response: Response<Accounts>) {
                if (response.isSuccessful) {
                    val data = response.body()
                    Snackbar.make(button_login,"USERNAME : "+field_username.text.toString(), Snackbar.LENGTH_LONG).show()

                    val intent = Intent(this@LoginActivity, NavigationActivity::class.java)
                    val bundle = Bundle()

                   /* bundle.putParcelable("employeeData",data)
                    intent.putExtra("myBundle",bundle)
                    startActivity(intent)*/
                }
                else {
                    dialog()
                }
            }
            override fun onFailure(call: Call<Accounts>, error: Throwable) {
                Log.e("tag", "errornya ${error.message}")
            }
        })
        }
    }

    private fun init(){
        mUserAccountApi = ApiRepository(this)
        service = mUserAccountApi.createLoginService()
    }


    private fun dialog(){
        val builder = AlertDialog.Builder(this@LoginActivity)

        builder.setMessage("Username atau Password salah !")
            .setCancelable(false)
            .setPositiveButton("Ok") { dialog, _ ->
                dialog.cancel()
            }

        val alert = builder.create()
        alert.show()
    }
}
