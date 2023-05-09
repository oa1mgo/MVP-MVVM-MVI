package net.taikula.architecturescompare.mvi

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.random.Random

class CounterViewModel : ViewModel() {

    private var _countState = MutableStateFlow(CounterState())

    val counterState: StateFlow<CounterState> = _countState.asStateFlow()

    fun addRandom() {
        _countState.update { currentState ->
            currentState.copy(
                curCount = _countState.value.curCount.plus(Random.nextInt(10))
            )
        }
    }

    fun reset() {
        _countState.update { currentState ->
            currentState.copy(
                curCount = 0
            )
        }
    }

    data class CounterState(
        val curCount: Int = 0
    )

}