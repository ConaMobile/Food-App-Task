package com.conamobile.foodapp.ui.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.conamobile.foodapp.ui.main.home_nav.HomeDrinksFragment
import com.conamobile.foodapp.ui.main.home_nav.HomeFoodsFragment

class HomeViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFoodsFragment()
            1 -> HomeDrinksFragment()
            else -> Fragment()
        }
    }
}