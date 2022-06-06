package com.conamobile.foodapp.ui.main.home_nav

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentHomeNavBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.ui.main.adapter.HomeViewPagerAdapter
import com.conamobile.foodapp.utils.extensions.viewBinding

class HomeNavFragment : BaseFragment(R.layout.fragment_home_nav) {
    private val binding by viewBinding { FragmentHomeNavBinding.bind(it) }
    lateinit var adapter: HomeViewPagerAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        binding.apply {
            adapter = HomeViewPagerAdapter(childFragmentManager, lifecycle)
            viewPager.adapter = adapter
            tabLayout.addTab(tabLayout.newTab().setText("Foods"))
            tabLayout.addTab(tabLayout.newTab().setText("Drinks"))
            tabLayout.addTab(tabLayout.newTab().setText("Snacks"))
            tabLayout.addTab(tabLayout.newTab().setText("Sauce"))

            viewPager.isUserInputEnabled = false
            viewPager.registerOnPageChangeCallback(object :
                ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    tabLayout.selectTab(tabLayout.getTabAt(position))
                }
            })
            viewPager.removeOverScroll()
        }
    }

    private fun ViewPager2.removeOverScroll() {
        (getChildAt(0) as? RecyclerView)?.overScrollMode = View.OVER_SCROLL_NEVER
    }
}