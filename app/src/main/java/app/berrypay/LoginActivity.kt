package app.berrypay

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.login_form.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_form)

        button_login.setOnClickListener {
            Snackbar.make(textView,"Hello",Snackbar.LENGTH_LONG).show()
            val intent = Intent(this,NavigationActivity::class.java)
            startActivity(intent)
        }

        forgot_account.setOnClickListener {
           val intent = Intent(this,CreateAccountActivity::class.java)
            startActivity(intent)
        }

    }
}
