package com.example.mysearch.model.repository

import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.model.datasourse.DataSource
import io.reactivex.Observable
import geekbrains.ru.translator.model.data.SearchResult
import geekbrains.ru.translator.model.datasource.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<SearchResult>>) :
    Repository<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        return dataSource.getData(word)
    }
}