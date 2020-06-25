package ru.elsu.conference.ui.view

import androidx.lifecycle.*
import ru.elsu.conference.ui.FragmentState

class FabCheckViewModel : ViewModel() {

    private val state = MutableLiveData<Int>()
    private var isChecked = MutableLiveData<Boolean>()

    init {
        isChecked.value = false
        state.value = FragmentState.EVENT_LIST
    }

    fun observeCheck(owner: LifecycleOwner, observer: Observer<Boolean>) {
        isChecked.observe(owner, observer)
    }

    fun setState(state: Int) {
        isChecked.value = state != FragmentState.STATISTICS
        this.state.value = state
    }

}