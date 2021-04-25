package com.io.geekmenu.ui

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.io.geekmenu.R
import com.io.geekmenu.base.fragment.BaseFragment
import com.io.geekmenu.data.model.MenuResponse
import com.io.geekmenu.databinding.FragmentMainBinding
import com.io.geekmenu.ui.adapter.CategoryAdapter
import com.io.geekmenu.ui.adapterActually.ActuallyAdapter


class MainFragment : BaseFragment<FragmentMainBinding>() {

    private val adapter = CategoryAdapter()
    private val adapterAct = ActuallyAdapter()

    override fun inflateView(inflater: LayoutInflater, container: ViewGroup?): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun init() {
        Glide.with(requireContext())
            .load(R.drawable.main_bg)
            .into(object : CustomTarget<Drawable>() {
                override fun onResourceReady(
                    resource: Drawable,
                    transition: Transition<in Drawable>?
                ) {
                    binding.constMain.background = resource
                }

                override fun onLoadCleared(placeholder: Drawable?) {

                }
            })
        initAdapter()

        val data = ArrayList<MenuResponse>()

        data.add(0, MenuResponse(R.drawable.test_image_2, "Water", 20))
        data.add(1, MenuResponse(R.drawable.test_image, "Food", 120))
        data.add(2, MenuResponse(R.drawable.test_image_2, "Water", 40))
        data.add(3, MenuResponse(R.drawable.test_image, "Water", 670))
        data.add(4, MenuResponse(R.drawable.test_image_2, "Water", 720))
        data.add(5, MenuResponse(R.drawable.test_image, "Water", 320))

        adapter.setData(data)

        val data2 = ArrayList<MenuResponse>()

        data2.add(0, MenuResponse(R.drawable.test_image_2, "Water", 20))
        data2.add(1, MenuResponse(R.drawable.test_image, "Food", 120))
        data2.add(2, MenuResponse(R.drawable.test_image_2, "Water", 40))
        data2.add(3, MenuResponse(R.drawable.test_image, "Water", 670))
        data2.add(4, MenuResponse(R.drawable.test_image_2, "Water", 720))
        data2.add(5, MenuResponse(R.drawable.test_image, "Water", 320))

        adapterAct.setData(data2)
    }

    private fun initAdapter() {
        binding.rvCategory.adapter = adapter
        adapter.itemClick = {

        }
        binding.rvActually.adapter = adapterAct
        adapterAct.itemClick = {

        }
    }

}