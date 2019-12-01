package com.tutorialsbuzz.viewmodelsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val users: MutableLiveData<List<String>> by lazy {
        MutableLiveData<List<String>>().also {
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<String>> {
        return users
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}