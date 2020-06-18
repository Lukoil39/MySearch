package com.example.mysearch.view.history

import com.example.mysearch.model.data.DataModel
import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.repository.Repository
import com.example.mysearch.model.repository.RepositoryLocal
import com.example.mysearch.viewmodel.Interactor

class HistoryInteractor(
    private val repositoryRemote: Repository<List<SearchResult>>,
    private val repositoryLocal: RepositoryLocal<List<SearchResult>>
) : Interactor<DataModel> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): DataModel {
        return DataModel.Success(
            if (fromRemoteSource) {
                repositoryRemote
            } else {
                repositoryLocal
            }.getData(word)
        )
    }
}