package com.conamobile.foodapp.ui.login.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.conamobile.foodapp.ui.login.InLoginFragment
import com.conamobile.foodapp.ui.login.InSignUpFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> InLoginFragment()
            1 -> InSignUpFragment()
            else -> Fragment()
        }
    }
}