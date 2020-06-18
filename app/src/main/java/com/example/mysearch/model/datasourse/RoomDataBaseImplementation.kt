package com.example.mysearch.model.datasourse

import com.example.mysearch.model.data.DataModel
import com.example.mysearch.model.data.SearchResult
import com.example.mysearch.utils.convertDataModelSuccessToEntity
import com.example.mysearch.utils.mapHistoryEntityToSearchResult


class RoomDataBaseImplementation(private val historyDao: HistoryDao) :
    DataSourceLocal<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> {
        return mapHistoryEntityToSearchResult(historyDao.all())
    }

    override suspend fun saveToDB(dataModel: DataModel) {
        convertDataModelSuccessToEntity(dataModel)?.let {
            historyDao.insert(it)
        }
    }
}