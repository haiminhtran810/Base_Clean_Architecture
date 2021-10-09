package com.htm.base_clean_architecture.ui.home

import com.htm.base_clean_architecture.BR
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentHomeBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel
    override val viewModel: HomeViewModel by viewModel()
    override val layoutId: Int
        get() = R.layout.fragment_home
}