package com.example.mysearch.model.datasourse

import com.example.mysearch.model.data.SearchResult
import io.reactivex.Observable
import geekbrains.ru.translator.model.data.SearchResult

class RoomDataBaseImplementation :
    DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
