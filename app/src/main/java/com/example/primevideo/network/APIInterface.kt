@file:Suppress("UNUSED_PARAMETER")

package com.example.androidbasesetup.networking.network

import com.example.primevideo.model.BaseModel
import com.example.primevideo.model.LatestTvModel
import com.example.primevideo.model.Results
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {
    private var apiKey: String
        get() = "1d4f1ebc80737f7c5cb49efca64e6e3d"
        set(value) = TODO()


    @GET("trending/all/day")
    fun getList(@Query("api_key") key: String = apiKey): Observable<BaseModel<List<Results>>>

    @GET("movie/top_rated")
    fun getTopRated(@Query("api_key") key: String = apiKey): Observable<BaseModel<List<Results>>>

    @GET("tv/latest")
    fun getLatest(@Query("api_key") key: String = apiKey): Observable<LatestTvModel>

//
//    @GET("genre/movies/list")
//    fun getMovies(@Query("api_key") key: String = apiKey): Observable<BaseModel<List<Results>>>

}
