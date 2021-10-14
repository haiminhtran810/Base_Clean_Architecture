package com.htm.base_clean_architecture.ui.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.htm.base_clean_architecture.base.BaseViewModel
import com.htm.base_clean_architecture.model.MovieItem
import com.htm.base_clean_architecture.model.MovieItemMapper
import com.htm.domain.usecase.movie.GetMoviesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class SplashViewModel(
    private val moviesUseCase: GetMoviesUseCase,
    private val movieItemMapper: MovieItemMapper
) : BaseViewModel() {
    val movies = MutableLiveData<List<MovieItem>>()

    init {
        getTempMovies()
    }

    private fun getTempMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val moviesDomain = moviesUseCase.executeWork(GetMoviesUseCase.Params(page = 1))
                val movieConvert = moviesDomain?.map {
                    movieItemMapper.mapToPresentation(it)
                }
                movies.postValue(movieConvert)
            } catch (e: Exception) {
                Timber.e(e)
                onError(e)
            }
        }
    }
}