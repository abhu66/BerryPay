package app.berrypay.activity.dashboard

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import app.berrypay.R
import app.berrypay.adapter.dashboard.DashboardAdapter
import app.berrypay.adapter.dashboard.DashboardAdsAdapter
import app.berrypay.model.dashboard.Dashboard_item
import app.berrypay.model.dashboard.Dashboard_item_ads

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_home.*




class DashboardActivity : AppCompatActivity() {

    private lateinit var dashboardAdapter       : DashboardAdapter
    private lateinit var dashboardAdapterAds    : DashboardAdsAdapter
    private  var listItem                       : MutableList<Dashboard_item>       = mutableListOf()
    private  var listItemAds                    : MutableList<Dashboard_item_ads>   = mutableListOf()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_home)


        //set actionbar and toolbar
        val actionBar = actionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFFFFF")))
        actionBar?.setDisplayShowTitleEnabled(false)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setSupportActionBar(toolbar_layout_home)


        Picasso.get().load(R.drawable.ic_profile_user).into(ic_profile_layout_home)
        listItemAds = listOf(
            Dashboard_item_ads ("Ads 1",R.drawable.image_1),
            Dashboard_item_ads ("Ads 2",R.drawable.image_2),
            Dashboard_item_ads ("Ads 3",R.drawable.image_3),
            Dashboard_item_ads ("Ads 4",R.drawable.image_4),
            Dashboard_item_ads ("Ads 5",R.drawable.image_1),
            Dashboard_item_ads ("Ads 6",R.drawable.image_2),
            Dashboard_item_ads ("Ads 7",R.drawable.image_3),
            Dashboard_item_ads ("Ads 8",R.drawable.image_4),
            Dashboard_item_ads ("Ads 9",R.drawable.image_2)
        ).toMutableList()

        listItem = listOf(
            Dashboard_item ("PULSA",R.drawable.ic_pulsa),
            Dashboard_item ("BAYAR",R.drawable.ic_bayar),
            Dashboard_item ("PLN",R.drawable.ic_pln),
            Dashboard_item ("TAGIHAN",R.drawable.ic_tagihan),
            Dashboard_item ("HISTORY",R.drawable.ic_history),
           Dashboard_item ("BANTUAN",R.drawable.ic_bantuan)
        ).toMutableList()

        //assign dshboard item ads
        dashboardAdapterAds = DashboardAdsAdapter(applicationContext,listItemAds){
                //change ths to call activity
                Toast.makeText(applicationContext,"Test",Toast.LENGTH_LONG).show()
        }

        //assign dashboard item
        dashboardAdapter = DashboardAdapter(applicationContext,listItem){
          if(it.nameItem == "PULSA"){
              //change ths to call activity
          }
          else {
              //change ths to call activity
              Toast.makeText(applicationContext,"Another Intent",Toast.LENGTH_LONG).show()
          }
       }

        //for recyclerview item ads
        rv_dashboard_horizontal_ads.apply {
            layoutManager = LinearLayoutManager(this@DashboardActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = dashboardAdapterAds

            btn_slide.setOnClickListener {
                rv_dashboard_horizontal_ads.smoothScrollToPosition(
                    (layoutManager as LinearLayoutManager).findLastVisibleItemPosition() + 1
                )
            }
        }

        //for recyclerview item dashbboar
        rv_dashboard_item.apply {
            layoutManager = GridLayoutManager(this@DashboardActivity,3)
            adapter = dashboardAdapter
       }

    }
}