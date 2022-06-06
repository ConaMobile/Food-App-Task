package com.conamobile.foodapp.ui.login

import android.os.Bundle
import android.view.View
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FragmentInSignUpBinding
import com.conamobile.foodapp.ui.BaseFragment
import com.conamobile.foodapp.utils.extensions.viewBinding

class InSignUpFragment : BaseFragment(R.layout.fragment_in_sign_up) {
    private val binding by viewBinding { FragmentInSignUpBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}