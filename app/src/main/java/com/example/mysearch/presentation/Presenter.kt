package com.example.mysearch.presentation

import com.example.mysearch.model.data.DataModel
import geekbrains.ru.translator.model.data.DataModel
import com.example.mysearch.view.base.View

interface Presenter<T : DataModel, V : View> {

    fun attachView(view: V)
    fun detachView(view: V)
    fun getData(word: String, isOnline: Boolean)
}
