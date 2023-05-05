package com.example.primevideo.ui.viewModel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.nourishinggeniusstudent.ui.view.base.BaseViewModel
import com.example.primevideo.model.Results
import com.example.primevideo.network.usecases.HomeUseCase

class HomeViewModel(mContext: Context) : BaseViewModel(mContext) {

    var dataList: ArrayList<Results> = arrayListOf()
    var dataLive: MutableLiveData<List<Results>?> = MutableLiveData()
    var topRatedLive: MutableLiveData<List<Results>?> = MutableLiveData()

    private val useCase = HomeUseCase(mContext, errorLiveData, dataLive, topRatedLive)

    fun getList() = useCase.getList()
    fun getTopRatedList() = useCase.getTopRated()
}