package com.example.mysearch.model.repository

import com.example.mysearch.model.data.DataModel
import com.example.mysearch.model.datasourse.DataSource
import io.reactivex.Observable

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}