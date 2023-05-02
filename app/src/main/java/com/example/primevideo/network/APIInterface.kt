package com.example.androidbasesetup.networking.network

import com.example.primevideo.Model.BaseModel
import com.example.primevideo.Model.Results
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {
    private var apiKey: String
        get() = "1d4f1ebc80737f7c5cb49efca64e6e3d"
        set(value) = TODO()


    @GET("/all/day")
    fun getList(@Query("api_key") key: String = apiKey): Observable<BaseModel<List<Results>>>

//    @GET("genre/tv/list")
//    fun getTvShows(@Query("api_key") key: String = apiKey): Observable<BaseModel<List<Results>>>
//
//    @GET("genre/movies/list")
//    fun getMovies(@Query("api_key") key: String = apiKey): Observable<BaseModel<List<Results>>>

}
