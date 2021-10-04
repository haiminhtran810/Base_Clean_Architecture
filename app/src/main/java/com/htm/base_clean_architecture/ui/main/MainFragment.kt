package com.htm.base_clean_architecture.ui.main

import androidx.fragment.app.viewModels
import com.htm.base_clean_architecture.BR
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseFragment
import com.htm.base_clean_architecture.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override val bindingVariable: Int
        get() = BR.viewModel

    override val viewModel: MainViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.fragment_main
}