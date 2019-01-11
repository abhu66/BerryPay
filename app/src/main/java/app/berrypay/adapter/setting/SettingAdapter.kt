package app.berrypay.adapter.setting

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.berrypay.R
import app.berrypay.model.Setting_item
import app.berrypay.model.dashboard.Dashboard_item
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dashboard_list_item.view.*
import kotlinx.android.synthetic.main.setting_list_item.view.*

class SettingAdapter (
    private val context : Context,
    private val settingItem : List<Setting_item>,
    private val listener: (Setting_item) -> Unit)
    : RecyclerView.Adapter<SettingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.setting_list_item, parent, false)

        return SettingViewHolder(v)
    }

    override fun getItemCount(): Int = settingItem.size

    override fun onBindViewHolder(holder: SettingViewHolder, position: Int) {
        holder.bindItem(settingItem[position],listener)
    }
}

class SettingViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(menuItem :Setting_item, listener: (Setting_item) -> Unit) {

        itemView.header_setting_name.text = menuItem.nameItem
        Picasso.get().load(menuItem.iconItem).resize(50,50).into(itemView.ic_setting_item)


        itemView.setOnClickListener {
            listener(menuItem)
        }
    }
}