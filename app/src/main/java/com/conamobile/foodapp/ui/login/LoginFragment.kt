package com.conamobile.foodapp.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentLoginBinding
import com.conamobile.foodapp.presenter.LoginFragmentViewModel
import com.conamobile.foodapp.presenter.impl.LoginFragmentViewModelImpl
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.ui.login.adapter.ViewPagerAdapter
import com.conamobile.foodapp.utils.extensions.viewBinding

class LoginFragment : BaseFragment(R.layout.fragment_login) {
    lateinit var adapter: ViewPagerAdapter
    private val viewModel: LoginFragmentViewModel by viewModels<LoginFragmentViewModelImpl>()
    private val binding by viewBinding { FragmentLoginBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        binding.apply {
            adapter = ViewPagerAdapter(childFragmentManager, lifecycle)
            viewPager.adapter = adapter
            tabLayout.addTab(tabLayout.newTab().setText("Login"))
            tabLayout.addTab(tabLayout.newTab().setText("Sign-up"))

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