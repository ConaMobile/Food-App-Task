package com.conamobile.foodapp.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentMainBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.ui.main.home_nav.HomeNavFragment
import com.conamobile.foodapp.utils.extensions.viewBinding

class MainFragment : BaseFragment(R.layout.fragment_main) {
    private val binding by viewBinding { FragmentMainBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        installView()
    }

    private fun installView() {
        false.goToFragment(HomeNavFragment())
        false.goToFragment2(HomeIncludeFragment())
    }

    private fun Boolean.goToFragment2(fragment: Fragment) {
        val transaction: FragmentTransaction =
            requireActivity().supportFragmentManager.beginTransaction()
        if (this) {
            transaction.addToBackStack(null)
        }
        transaction.add(R.id.frameLayoutNav, fragment).commit()
    }


    private fun Boolean.goToFragment(fragment: Fragment) {
        val transaction: FragmentTransaction =
            requireActivity().supportFragmentManager.beginTransaction()
        if (this) {
            transaction.addToBackStack(null)
        }
        transaction.add(R.id.frameLayoutIncluded, fragment).commit()
    }
}