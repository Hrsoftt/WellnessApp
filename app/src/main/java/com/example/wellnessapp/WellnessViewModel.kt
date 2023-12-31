package com.example.wellnessapp

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel(){
    private val _task = getWellnessTask().toMutableStateList()
    val task: List<WellnessTask>
        get() = _task

    fun remove(item: WellnessTask){
        _task.remove(item)
    }
    fun changeTaskChecked(item: WellnessTask, checked: Boolean){
        task.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }

    }
}
private fun getWellnessTask()= List(30) {it -> WellnessTask( id = it, label = "# $it")}