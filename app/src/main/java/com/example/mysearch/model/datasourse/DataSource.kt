package com.example.mysearch.model.datasourse

import io.reactivex.Observable

interface DataSource<T> {

    fun getData(word: String): Observable<T>
}