package com.htm.base_clean_architecture.ui.home

import androidx.fragment.app.viewModels
import com.htm.base_clean_architecture.BR
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel
    override val viewModel: HomeViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.fragment_home
}