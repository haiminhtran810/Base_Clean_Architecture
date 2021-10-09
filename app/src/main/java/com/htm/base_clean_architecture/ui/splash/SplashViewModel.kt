package com.htm.base_clean_architecture.ui.splash

import androidx.lifecycle.viewModelScope
import com.htm.base_clean_architecture.base.BaseViewModel
import com.htm.domain.usecase.movie.GetMoviesUseCase
import kotlinx.coroutines.launch

class SplashViewModel() : BaseViewModel() {
    init {
        getTempMovies()
    }

    private fun getTempMovies() {
        viewModelScope.launch {
            //moviesUseCase.executeWork(GetMoviesUseCase.Params(page = 0))
        }
    }
}