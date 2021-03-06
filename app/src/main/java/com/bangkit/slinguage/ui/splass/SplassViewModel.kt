package com.bangkit.slinguage.ui.splass

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bangkit.slinguage.data.source.Repository
import com.bangkit.slinguage.data.source.Resource

class SplassViewModel (private val repository: Repository) : ViewModel() {

    fun isLogin(): LiveData<Resource<Boolean>> =
        repository.isLogin()
}