package app.berrypay.activity.login

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import app.berrypay.R
import app.berrypay.activity.navigation.NavigationActivity
import app.berrypay.view.login.LoginView
import kotlinx.android.synthetic.main.login_form.*
import org.jetbrains.anko.startActivity


class LoginActivity : AppCompatActivity(), LoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_form)
        prosessLogin()

    }

    override fun showLoading() {

    }

    override fun hideLoading() {
    }


    private fun prosessLogin(){
        button_login.setOnClickListener {
            if((field_username.text.toString() == "Abhu66") &&
                (field_password.text.toString() == "root")){
                Snackbar.make(field_username,"Login Sukses !",Snackbar.LENGTH_LONG).show()
                startActivity<NavigationActivity>()
            }
            else {
                Snackbar.make(field_username,"Login Gagal !",Snackbar.LENGTH_LONG).show()
            }
        }
    }
    override fun loginProcess() {

    }
}
