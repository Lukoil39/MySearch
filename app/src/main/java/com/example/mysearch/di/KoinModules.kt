package com.example.mysearch.di

import androidx.room.Room
import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.datasourse.RetrofitImplementation
import com.example.mysearch.model.datasourse.RoomDataBaseImplementation
import com.example.mysearch.model.repository.Repository
import com.example.mysearch.model.repository.RepositoryImplementation
import com.example.mysearch.view.main.MainInteractor
import org.koin.dsl.module

val application = module {
    single { Room.databaseBuilder(get(), HistoryDataBase::class.java, "HistoryDB").build() }
    single { get<HistoryDataBase>().historyDao() }
    single<Repository<List<SearchResult>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<SearchResult>>> { RepositoryImplementationLocal(
        RoomDataBaseImplementation(get())
    )
    }
}

val mainScreen = module {
    factory { MainViewModel(get()) }
    factory { MainInteractor(get(), get()) }
}

val historyScreen = module {
    factory { HistoryViewModel(get()) }
    factory { HistoryInteractor(get(), get()) }
}
