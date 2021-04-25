package com.io.geekmenu.ui.adapter

import android.view.ViewGroup
import com.io.geekmenu.R
import com.io.geekmenu.base.adapter.BaseAdapter
import com.io.geekmenu.data.model.MenuResponse

class CategoryAdapter : BaseAdapter<MenuResponse, CategoryVH>() {
    var itemClick: (MenuResponse) -> Unit = { }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryVH {
        val holder = CategoryVH(parent, R.layout.item_menu)
        holder.itemView.setOnClickListener { itemClick(items[holder.adapterPosition]) }
        return holder
    }
}