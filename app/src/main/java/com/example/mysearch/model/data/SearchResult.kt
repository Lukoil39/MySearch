package com.example.mysearch.model.data

import com.example.mysearch.model.data.Meanings
import com.google.gson.annotations.SerializedName

class SearchResult(
    @field:SerializedName("text") val text: String?,
    @field:SerializedName("meanings") val meanings: List<Meanings>?
)