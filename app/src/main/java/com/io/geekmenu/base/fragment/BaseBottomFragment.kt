package com.io.geekmenu.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomFragment<Binding : ViewBinding> : BottomSheetDialogFragment() {
    private var _binding : Binding? = null
    protected val binding : Binding
        get() =  _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = inflateView(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    abstract fun inflateView(inflater: LayoutInflater, container: ViewGroup?): Binding

    abstract fun init()


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}