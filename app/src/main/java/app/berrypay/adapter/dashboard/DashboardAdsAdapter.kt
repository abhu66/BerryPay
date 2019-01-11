package app.berrypay.adapter.dashboard

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.berrypay.R
import com.squareup.picasso.Picasso
import app.berrypay.model.dashboard.Dashboard_item_ads
import kotlinx.android.synthetic.main.ads_item.view.*


class DashboardAdsAdapter (
    private val context : Context,
    private val dashboardItem : List<Dashboard_item_ads>,
    private val listener: (Dashboard_item_ads) -> Unit)
    : RecyclerView.Adapter<DahsboardAdsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DahsboardAdsViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.ads_item, parent, false)

        return DahsboardAdsViewHolder(v)
    }

    override fun getItemCount(): Int = dashboardItem.size

    override fun onBindViewHolder(holder: DahsboardAdsViewHolder, position: Int) {
        holder.bindItem(dashboardItem[position],listener)
    }
}

class DahsboardAdsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {


//    private lateinit var context : Context
    fun bindItem(menuItem :Dashboard_item_ads, listener: (Dashboard_item_ads) -> Unit) {

        itemView.lbl_opening_ads.text = menuItem.nameItem
        itemView.lbl_item_name_ads.text = menuItem.nameItem
        Picasso.get().load(menuItem.iconItem).into(itemView.image_ads_item)

//        itemView.btn_share.setOnClickListener {
//            val shareBodyText = "https://www.google.com"
//
//
//            val intent = Intent().apply {
//                this.action = Intent.ACTION_SEND
//                this.putExtra(android.content.Intent.EXTRA_SUBJECT, "BerryPay")
//                this.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText)
//                this.type = "text/plain"
//            }
//
//            context = view.context
//            context.startActivity(Intent.createChooser(intent,"Share.."))
//        }

        itemView.setOnClickListener {
            listener(menuItem)
        }
    }
}