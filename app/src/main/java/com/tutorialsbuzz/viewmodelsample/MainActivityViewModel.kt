package com.tutorialsbuzz.viewmodelsample

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.concurrent.atomic.AtomicInteger

class MainActivityViewModel : ViewModel() {

    val TAG: String = MainActivityViewModel::class.java.simpleName
    var myRandomNumber = MutableLiveData<String>().apply {
        value = (0..10).random().toString()
    }

    fun createRandomNumber() {
        Log.d(TAG, "createRandomNumber");
        myRandomNumber.value = (0..10).random().toString()
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "onCleared");
    }
}