package app.berrypay.activity.notification

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import app.berrypay.R

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_notification)

        val actionBar = this.supportActionBar
        actionBar?.title = "Notification"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
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
