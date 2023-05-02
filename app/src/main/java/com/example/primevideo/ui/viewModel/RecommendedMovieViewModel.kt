package com.example.primevideo.ui.viewModel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.primevideo.Model.Results
import com.example.primevideo.ui.view.BaseViewModel
import com.example.primevideo.usecases.HomeUseCase

class RecommendedMovieViewModel(mContext: Context) : BaseViewModel(mContext) {

    var dataList: ArrayList<Results> = arrayListOf()
    var dataLive: MutableLiveData<List<Results>?> = MutableLiveData()

    private val useCase = HomeUseCase(mContext, errorLiveData, dataLive)

    fun getList() = useCase.getList()
}