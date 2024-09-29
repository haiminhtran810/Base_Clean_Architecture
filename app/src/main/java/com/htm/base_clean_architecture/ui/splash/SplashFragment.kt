package com.htm.base_clean_architecture.ui.splash


import android.view.LayoutInflater
import android.view.ViewGroup
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentSplashBinding
import org.koin.android.viewmodel.ext.android.viewModel
import timber.log.Timber

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    private val viewModel: SplashViewModel by viewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSplashBinding
        get() = FragmentSplashBinding::inflate

    override fun observeEvent() {
        super.observeEvent()
        viewModel.apply {
            movies.observe(viewLifecycleOwner) {
                Timber.d(it.toString())
            }
        }
    }
}