package com.htm.base_clean_architecture.ui.splash

import androidx.fragment.app.viewModels
import com.htm.base_clean_architecture.BR
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel
    override val viewModel: SplashViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.fragment_splash
}