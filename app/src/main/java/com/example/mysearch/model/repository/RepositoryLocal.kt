package com.example.mysearch.model.repository

import com.example.mysearch.model.data.DataModel

interface RepositoryLocal<T> : Repository<T> {

    suspend fun saveToDB(dataModel: DataModel)
}