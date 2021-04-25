package com.io.geekmenu.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.io.geekmenu.base.fragment.BaseFragment
import com.io.geekmenu.databinding.FragmentAuthBinding


class AuthFragment : BaseFragment<FragmentAuthBinding>() {

    override fun inflateView(inflater: LayoutInflater, container: ViewGroup?): FragmentAuthBinding {
        return FragmentAuthBinding.inflate(inflater, container, false)
    }

    override fun init() {
        binding.btnStart.setOnClickListener {
            it.findNavController()
                .navigate(AuthFragmentDirections.actionAuthFragmentToMainFragment())
        }
    }
}