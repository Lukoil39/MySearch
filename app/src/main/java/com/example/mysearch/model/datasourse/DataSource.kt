package com.example.mysearch.model.datasourse

interface DataSource<T> {

    suspend fun getData(word: String): T
}
