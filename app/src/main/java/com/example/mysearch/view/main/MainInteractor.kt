package com.example.mysearch.view.main

//import com.anikin.aleksandr.simplevocabulary.viewmodel.Interactor
import com.example.mysearch.presentation.Interactor
import com.example.mysearch.model.repository.Repository
import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.data.DataModel
//import geekbrains.ru.translator.model.data.DataModel
//import geekbrains.ru.translator.model.data.SearchResult
//import geekbrains.ru.translator.model.repository.Repository
import io.reactivex.Observable

class MainInteractor(
    private val remoteRepository: Repository<List<SearchResult>>,
    private val localRepository: Repository<List<SearchResult>>
) : Interactor<DataModel> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<DataModel> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { DataModel.Success(it) }
        } else {
            localRepository.getData(word).map { DataModel.Success(it) }
        }
    }
}
