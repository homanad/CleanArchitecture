package com.android.baseproject.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.baseproject.R
import com.android.baseproject.common.base.BaseFragment

class HomeFragment : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun setupViewModel() {

    }

    override fun setupUI() {

    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}