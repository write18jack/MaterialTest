package com.example.materialtest.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.materialtest.R

class HomeViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>().apply {
        value = R.drawable.felix
        value = R.drawable.griezmann
    }
    val image: LiveData<Int> = _image
}