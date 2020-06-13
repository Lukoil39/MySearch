package com.example.mysearch.model.datasourse

import com.example.mysearch.model.data.SearchResult

class RoomDataBaseImplementation : DataSource<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}