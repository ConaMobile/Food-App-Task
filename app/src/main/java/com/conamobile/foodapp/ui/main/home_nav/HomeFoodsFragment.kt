package com.conamobile.foodapp.ui.main.home_nav

import android.os.Bundle
import android.view.View
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentHomeFoodsBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.utils.extensions.viewBinding

class HomeFoodsFragment : BaseFragment(R.layout.fragment_home_foods) {
    private val binding by viewBinding { FragmentHomeFoodsBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}