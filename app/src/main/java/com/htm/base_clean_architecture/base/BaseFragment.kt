package com.htm.base_clean_architecture.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import java.lang.IllegalArgumentException

abstract class BaseFragment<B : ViewBinding>() : Fragment() {

    private var _viewBinding: B? = null
    protected val viewBinding get() = _viewBinding!!


    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> B

    protected lateinit var baseActivity: BaseActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _viewBinding = bindingInflater.invoke(inflater, container, false)
        return viewBinding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context !is BaseActivity) {
            throw IllegalArgumentException("the host activity must be BaseActivity or it's derived class")
        }
        baseActivity = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeEvent()
    }


    override fun onDestroyView() {
        _viewBinding = null
        super.onDestroyView()
    }

    open fun observeEvent() {}

}