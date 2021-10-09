package com.htm.base_clean_architecture.ui.main

import com.htm.base_clean_architecture.BR
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentMainBinding
import org.koin.android.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel

    override val viewModel: MainViewModel by viewModel()

    override val layoutId: Int
        get() = R.layout.fragment_main
}