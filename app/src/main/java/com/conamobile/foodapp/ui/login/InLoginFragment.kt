package com.conamobile.foodapp.ui.login

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentInLoginBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.utils.extensions.viewBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.ldralighieri.corbind.view.clicks

class InLoginFragment : BaseFragment(R.layout.fragment_in_login) {
    private val binding by viewBinding { FragmentInLoginBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginBtnManager()
    }

    private fun loginBtnManager() {
        binding.loginBtn.clicks().onEach {
            sharedPreferences.apply {
                isLoginPageBoolean(true)
                isSaveEmail(binding.emailEdt.text.toString())
            }
            navigate(InLoginFragmentDirections.actionInLoginFragmentToMainFragment())
        }.launchIn(lifecycleScope)
    }
}