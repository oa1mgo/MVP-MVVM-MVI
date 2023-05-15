package net.taikula.architecturescompare.mvvm

import androidx.lifecycle.MutableLiveData

class CountModel {
    var count: MutableLiveData<Int> = MutableLiveData(0)
}