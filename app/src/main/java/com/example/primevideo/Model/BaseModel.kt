package com.example.primevideo.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class BaseModel<T> : Serializable {

    @SerializedName("message")
    var message: String = ""

    @SerializedName("status")
    var status: Int = 200

    @SerializedName("data")
    var data: T? = null
}
