package com.example.mysearch.model.datasourse

import com.example.mysearch.model.data.SearchResult
import geekbrains.ru.translator.model.data.SearchResult
import io.reactivex.Observable

class DataSourceRemote(private val remoteProvider: RetrofitImplementation = RetrofitImplementation()) :
    DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> = remoteProvider.getData(word)
}
