package com.conamobile.foodapp.ui.main.home_nav

import android.os.Bundle
import android.view.View
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentHomeDrinksBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.utils.extensions.viewBinding

class HomeDrinksFragment : BaseFragment(R.layout.fragment_home_drinks) {
    private val binding by viewBinding { FragmentHomeDrinksBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}