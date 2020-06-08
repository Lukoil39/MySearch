package com.example.mysearch.model.data

import com.example.mysearch.model.data.Translation
import com.google.gson.annotations.SerializedName

class Meanings(
    @field:SerializedName("translation") val translation: Translation?,
    @field:SerializedName("imageUrl") val imageUrl: String?
)
