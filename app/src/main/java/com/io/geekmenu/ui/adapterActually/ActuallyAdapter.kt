package com.io.geekmenu.ui.adapterActually

import android.view.ViewGroup
import com.io.geekmenu.R
import com.io.geekmenu.base.adapter.BaseAdapter
import com.io.geekmenu.data.model.MenuResponse

class ActuallyAdapter : BaseAdapter<MenuResponse, ActuallyVH>() {
    var itemClick: (MenuResponse) -> Unit = { }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActuallyVH {
        val holder = ActuallyVH(parent, R.layout.item_menu_act)
        holder.itemView.setOnClickListener { itemClick(items[holder.adapterPosition]) }
        return holder
    }
}