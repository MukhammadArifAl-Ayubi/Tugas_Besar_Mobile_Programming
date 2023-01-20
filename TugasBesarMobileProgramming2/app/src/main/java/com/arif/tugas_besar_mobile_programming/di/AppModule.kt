package com.arif.tugas_besar_mobile_programming.di

import com.arif.tugas_besar_mobile_programming.core.domain.usecase.movie.MovieInteractor
import com.arif.tugas_besar_mobile_programming.core.domain.usecase.movie.MovieUseCase
import com.arif.tugas_besar_mobile_programming.core.domain.usecase.tvshow.TvShowInteractor
import com.arif.tugas_besar_mobile_programming.core.domain.usecase.tvshow.TvShowUseCase
import com.arif.tugas_besar_mobile_programming.ui.movie.MovieViewModel
import com.arif.tugas_besar_mobile_programming.ui.tvshow.TvShowViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
    factory<TvShowUseCase> { TvShowInteractor(get()) }
}

val viewModelModule= module {
    viewModel { MovieViewModel(get()) }
    viewModel { TvShowViewModel(get())}
}

