package com.example.mysearch.model.datasourse

import com.example.mysearch.model.data.DataModel

interface DataSourceLocal<T> : DataSource<T> {

    suspend fun saveToDB(dataModel: DataModel)
}