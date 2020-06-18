package com.example.mysearch.viewmodel

import com.example.mysearch.model.data.DataModel

interface Interactor<T> {

    suspend fun getData(word: String, fromRemoteSource: Boolean): DataModel
}