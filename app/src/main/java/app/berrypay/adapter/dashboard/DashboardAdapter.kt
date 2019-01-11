package app.berrypay.adapter.dashboard

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.berrypay.R
import app.berrypay.model.dashboard.Dashboard_item
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dashboard_list_item.view.*

class DashboardAdapter (
    private val context : Context,
    private val dashboardItem : List<Dashboard_item>,
    private val listener: (Dashboard_item) -> Unit)
    : RecyclerView.Adapter<DahsboardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DahsboardViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.dashboard_list_item, parent, false)

        return DahsboardViewHolder(v)
    }

    override fun getItemCount(): Int = dashboardItem.size

    override fun onBindViewHolder(holder: DahsboardViewHolder, position: Int) {
        holder.bindItem(dashboardItem[position],listener)
    }
}

class DahsboardViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(menuItem :Dashboard_item, listener: (Dashboard_item) -> Unit) {

        itemView.dashboard_item_name.text = menuItem.nameItem
        Picasso.get().load(menuItem.iconItem).resize(50,50).into(itemView.menu_icon)


        itemView.setOnClickListener {
            listener(menuItem)
        }
    }
}