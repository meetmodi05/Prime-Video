package com.example.primevideo.usecases

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.androidbasesetup.networking.network.CallbackObserver
import com.example.androidbasesetup.networking.network.Networking
import com.example.primevideo.Model.BaseModel
import com.example.primevideo.Model.Results
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HomeUseCase(
    mContext: Context,
    private var errorLiveData: MutableLiveData<String>,
    private var demoLiveData: MutableLiveData<List<Results>?>,
    private var topRatedLiveData: MutableLiveData<List<Results>?>,
) {
    fun getList() {
        if (demoLiveData == null) return
        Networking.with().getServices().getList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : CallbackObserver<BaseModel<List<Results>>>() {
                override fun onSuccess(response: BaseModel<List<Results>>) {
//                    demoLiveData.value = response.results
                    demoLiveData.postValue(response.results)
                    Log.d("onSuccess", "onSuccess: $response")
                }

                override fun onFailed(code: Int, message: String) {
                    errorLiveData.value = message
                    Log.e("onFailed", "onFailed: $message+++$code")
                }
            })
    }

    fun getTopRated() {
        if (topRatedLiveData == null) return
        Networking.with().getServices().getTopRated().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : CallbackObserver<BaseModel<List<Results>>>() {
                override fun onSuccess(response: BaseModel<List<Results>>) {
                    topRatedLiveData.postValue(response.results)
                }

                override fun onFailed(code: Int, message: String) {
                    errorLiveData.postValue(message)
                }

            })
    }
}


