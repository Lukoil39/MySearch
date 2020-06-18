package com.example.mysearch.model.repository

import com.example.mysearch.model.data.DataModel
import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.datasourse.DataSourceLocal

class RepositoryImplementationLocal(private val dataSource: DataSourceLocal<List<SearchResult>>) :
    RepositoryLocal<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(dataModel: DataModel) {
        dataSource.saveToDB(dataModel)
    }
}
