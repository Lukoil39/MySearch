package com.example.mysearch.di

import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.datasourse.RetrofitImplementation
import com.example.mysearch.model.datasourse.RoomDataBaseImplementation
import com.example.mysearch.model.repository.Repository
import com.example.mysearch.model.repository.RepositoryImplementation
import com.example.mysearch.view.main.MainInteractor
import com.example.mysearch.view.main.MainViewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val application = module {
    single<Repository<List<SearchResult>>>(named(NAME_REMOTE)) { RepositoryImplementation(
        RetrofitImplementation()
    ) }
    single<Repository<List<SearchResult>>>(named(NAME_LOCAL)) { RepositoryImplementation(
        RoomDataBaseImplementation()
    ) }
}

val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REMOTE)), get(named(NAME_LOCAL))) }
    factory { MainViewModel(get()) }
}