package app.berrypay.activity.login

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import app.berrypay.R
import app.berrypay.activity.dashboard.DashboardActivity
import app.berrypay.view.BaseView
import kotlinx.android.synthetic.main.login_form.*
import org.jetbrains.anko.startActivity


class LoginActivity : AppCompatActivity(), BaseView {


    //private lateinit var mUserAccountApi : ApiRepository
    //private var service : UserAccountService? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_form)
       // init()

        val listItem = arrayOf("+62","+60")
        val flag = arrayOf(R.drawable.indonesia_flag, R.drawable.malaysia_flag)
        val arrayAdapterView = app.berrypay.adapter.SpinnerAdapter(applicationContext,flag,listItem)
        spinner_login.adapter = arrayAdapterView

        spinner_login.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }


        button_login.setOnClickListener {
            if(field_username.text.toString() == "81218209581" && field_password.text.toString() == "root"){
                startActivity<DashboardActivity>()
            }
            else {
                Snackbar.make(button_login, "Login gagal",Snackbar.LENGTH_LONG).show()
            }
        }
    }

    override fun showLoading() {

    }

    override fun hideLoading() {
    }


//    private fun prosessLogin(){
//        button_login.setOnClickListener {
//            service?.login(field_username.text.toString(), field_password.text.toString())
//                ?.enqueue(object : Callback<Accounts> {
//            override fun onResponse(call: Call<Accounts>, response: Response<Accounts>) {
//                if (response.isSuccessful) {
//                    val data = response.body()
//                    Snackbar.make(button_login,"USERNAME : "+field_username.text.toString(), Snackbar.LENGTH_LONG).show()
//
//                    val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
//                    val bundle = Bundle()
//
//                   /* bundle.putParcelable("employeeData",data)
//                    intent.putExtra("myBundle",bundle)
//                    startActivity(intent)*/
//                }
//                else {
//                    dialog()
//                }
//            }
//            override fun onFailure(call: Call<Accounts>, error: Throwable) {
//                Log.e("tag", "errornya ${error.message}")
//            }
//        })
//        }
//    }

//    private fun init(){
//        mUserAccountApi = ApiRepository(this)
//        service = mUserAccountApi.createLoginService()
//    }


//    private fun dialog(){
//        val builder = AlertDialog.Builder(this@LoginActivity)
//
//        builder.setMessage("Username atau Password salah !")
//            .setCancelable(false)
//            .setPositiveButton("Ok") { dialog, _ ->
//                dialog.cancel()
//            }
//
//        val alert = builder.create()
//        alert.show()
//    }

}
