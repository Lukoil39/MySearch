package com.example.mysearch.view.base

import androidx.appcompat.app.AppCompatActivity
import com.example.mysearch.model.data.AppState
import com.example.mysearch.viewmodel.Interactor
import com.example.mysearch.viewmodel.ViewModel

abstract class BaseActivity<T : AppState, I : Interactor<T>> : AppCompatActivity() {

    abstract val model: ViewModel<T>

    abstract fun renderData(dataModel: T)
}
