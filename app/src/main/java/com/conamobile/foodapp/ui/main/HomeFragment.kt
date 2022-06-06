package com.conamobile.foodapp.ui.main

import android.os.Bundle
import android.view.View
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentHomeBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.utils.extensions.viewBinding

class HomeFragment : BaseFragment(R.layout.fragment_home) {
    private val binding by viewBinding { FragmentHomeBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}