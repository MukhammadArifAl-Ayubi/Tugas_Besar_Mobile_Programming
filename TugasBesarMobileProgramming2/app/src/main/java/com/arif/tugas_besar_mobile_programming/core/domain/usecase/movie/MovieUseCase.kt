package com.arif.tugas_besar_mobile_programming.core.domain.usecase.movie

import com.arif.tugas_besar_mobile_programming.core.data.remote.Resource
import com.arif.tugas_besar_mobile_programming.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase{
    fun getMovies(): Flow<Resource<List<Movie>>>
}