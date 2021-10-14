package com.htm.base_clean_architecture.ui.splash

import androidx.lifecycle.viewModelScope
import com.htm.base_clean_architecture.base.BaseViewModel
import com.htm.domain.usecase.movie.GetMoviesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class SplashViewModel(private val moviesUseCase: GetMoviesUseCase) : BaseViewModel() {
    init {
        getTempMovies()
    }

    private fun getTempMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                moviesUseCase.executeWork(GetMoviesUseCase.Params(page = 0))
            } catch (e: Exception) {
                Timber.e(e)
                onError(e)
            }

        }
    }
}