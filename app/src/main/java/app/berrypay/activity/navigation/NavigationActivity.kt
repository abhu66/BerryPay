package app.berrypay.activity.navigation

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import app.berrypay.R
import app.berrypay.activity.notification.NotificationActivity
import com.synnapps.carouselview.CarouselView
import kotlinx.android.synthetic.main.activity_navigation.*
import kotlinx.android.synthetic.main.app_bar_navigation.*
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.content_navigation.*
import org.jetbrains.anko.startActivity


class NavigationActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var mCarouselView   : CarouselView
    private var sampleImages            = intArrayOf(R.drawable.image_1, R.drawable.image_3, R.drawable.image_4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        setSupportActionBar(toolbar)

        val actionBar = this.supportActionBar
        actionBar?.title = "BerryPay"

        mCarouselView           = carouselView
        mCarouselView.pageCount = sampleImages.size
        mCarouselView.setImageListener(imageListener)


        //toogle button drawer
        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            logoutProcess()
            //super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.navigation, menu)
        return true
    }

    //notification icon action
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_notification -> {
                startActivity<NotificationActivity>()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    //menu item navigation drawer
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_beranda -> {
                // Handle the camera action
            }
            R.id.nav_profile -> {

            }
            R.id.nav_upload_ktp -> {

            }
            R.id.nav_ganti_sandi -> {

            }
            R.id.nav_sayarat_ketentuan -> {

            }
            R.id.nav_hubungi_kami -> {
            }
            R.id.nav_tentang_kami -> {

            }
            R.id.nav_keluar -> {
                logoutProcess()
            }
        }
        return true
    }

    private fun logoutProcess() {
        val builder = AlertDialog.Builder(this@NavigationActivity)
        builder.setTitle(R.string.app_name)
        builder.setIcon(R.mipmap.ic_launcher)
        builder.setMessage("Do you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes") { _, _ ->
                this.finish()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.cancel()
            }

        val alert = builder.create()
        alert.show()
    }

    private var imageListener: ImageListener = ImageListener { position, imageView ->
        imageView.setImageResource(sampleImages[position])
    }
}