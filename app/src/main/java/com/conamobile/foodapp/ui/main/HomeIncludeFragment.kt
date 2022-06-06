package com.conamobile.foodapp.ui.main

import android.os.Bundle
import android.view.View
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentHomeIncludeBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.utils.extensions.viewBinding

class HomeIncludeFragment : BaseFragment(R.layout.fragment_home_include) {
    private val binding by viewBinding { FragmentHomeIncludeBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}