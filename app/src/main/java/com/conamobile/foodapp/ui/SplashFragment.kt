package com.conamobile.foodapp.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.conamobile.foodapp.R
import com.conamobile.foodapp.presenter.SplashScreenViewModel
import com.conamobile.foodapp.presenter.impl.SplashScreenViewModelImpl
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class SplashFragment : BaseFragment(R.layout.fragment_splash) {

    private val viewModel: SplashScreenViewModel by viewModels<SplashScreenViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.openNextScreenFlow.onEach {
            if (sharedPreferences.getLoginPageBoolean())
                navigate(SplashFragmentDirections.actionSplashFragmentToMainFragment())
            else navigate(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
        }.launchIn(lifecycleScope)
    }
}