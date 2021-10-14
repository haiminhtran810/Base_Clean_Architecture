package com.htm.base_clean_architecture.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    fun onError(error: Throwable) {
        when (error) {

        }
    }
}