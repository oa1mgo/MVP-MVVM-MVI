package net.taikula.architecturescompare.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class CounterViewModel : ViewModel() {

    private val countModel = CountModel()

    fun addRandom() {
        countModel.count.value = (countModel.count.value ?: 0).plus(Random.nextInt(10))
    }

    fun reset() {
        countModel.count.value = 0
    }

    fun getCount(): MutableLiveData<Int> {
        return countModel.count
    }

}