package app.berrypay.activity.register

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import app.berrypay.R

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_form)

        val actionBar = supportActionBar
        actionBar?.setTitle("Create New Account").toString()
        actionBar?.setDisplayHomeAsUpEnabled(true)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
