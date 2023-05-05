package com.example.primevideo.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class BaseModel<T> : Serializable {

    @SerializedName("page")
    var page: Int = 0

    @SerializedName("results")
    var results: ArrayList<Results>? = arrayListOf()

    @SerializedName("total_pages")
    var totalPages: Long? = null

    @SerializedName("total_results")
    var totalResults: Long? = null
}
