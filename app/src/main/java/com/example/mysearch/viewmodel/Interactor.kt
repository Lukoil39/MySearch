package com.example.mysearch.viewmodel

import com.example.mysearch.model.data.DataModel
import io.reactivex.Observable

interface Interactor<T> {

    suspend fun getData(word: String, fromRemoteSource: Boolean): DataModel
}