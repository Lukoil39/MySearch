package com.example.mysearch.model.repository

import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.datasourse.DataSource


class RepositoryImplementation(private val dataSource: DataSource<List<SearchResult>>) :
    Repository<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> {
        return dataSource.getData(word)
    }
}