package com.io.geekmenu.base.adapter

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.io.geekmenu.utils.extesions.inflate

abstract class BaseVH<Item>(parent: ViewGroup, @LayoutRes id: Int) : RecyclerView.ViewHolder(parent.inflate(id)){

    abstract fun bind(item : Item)
}