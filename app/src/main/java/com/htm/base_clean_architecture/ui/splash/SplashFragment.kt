package com.htm.base_clean_architecture.ui.splash

import com.htm.base_clean_architecture.BR
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentSplashBinding
import org.koin.android.viewmodel.ext.android.viewModel
import timber.log.Timber

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel

    override val viewModel: SplashViewModel by viewModel()

    override val layoutId: Int
        get() = R.layout.fragment_splash

    override fun observeEvent() {
        super.observeEvent()
        viewModel.apply {
            movies.observe(viewLifecycleOwner, {
                Timber.d(it.toString())
            })
        }
    }
}