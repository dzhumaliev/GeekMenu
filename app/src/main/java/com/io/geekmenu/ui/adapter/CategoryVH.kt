package com.io.geekmenu.ui.adapter

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.bumptech.glide.Glide
import com.io.geekmenu.App
import com.io.geekmenu.R
import com.io.geekmenu.base.adapter.BaseVH
import com.io.geekmenu.data.model.MenuResponse

class CategoryVH(parent: ViewGroup, @LayoutRes id: Int) :
    BaseVH<MenuResponse>(parent, id) {
    private val title = itemView.findViewById<TextView>(R.id.tv_title)
    private val count = itemView.findViewById<TextView>(R.id.tv_count)
    private val image = itemView.findViewById<ImageView>(R.id.img)
    override fun bind(item: MenuResponse) {
        title.text = item.title
        count.text = item.count.toString()
        Glide.with(App.context).load(item.image).into(image)

    }
}