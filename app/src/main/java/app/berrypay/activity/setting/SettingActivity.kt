package app.berrypay.activity.setting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.widget.Toast
import app.berrypay.R
import app.berrypay.adapter.setting.SettingAdapter
import app.berrypay.model.Setting_item
import app.berrypay.view.BaseView
import kotlinx.android.synthetic.main.layout_setting.*


class SettingActivity : AppCompatActivity(), BaseView {

    private lateinit var settingAdapter: SettingAdapter
    private  var listItem : MutableList<Setting_item>  = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_setting)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Pengaturan"

        listItem = listOf(
            Setting_item("Profile",R.drawable.ic_user_profile),
            Setting_item("Bahasa",R.drawable.ic_languange)
        ).toMutableList()

        settingAdapter = SettingAdapter(applicationContext,listItem){
            Toast.makeText(this,"Its Work !", Toast.LENGTH_LONG).show()
        }
        rv_setting.apply {
            layoutManager = LinearLayoutManager(this@SettingActivity)
            adapter = settingAdapter
        }
    }


    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home ->{
            finish()
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    override fun showLoading() {

    }

    override fun hideLoading() {
    }

}
