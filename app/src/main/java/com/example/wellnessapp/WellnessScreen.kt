package com.example.wellnessapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

//represents the main screen
@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
    ){
    Column (modifier = modifier){
        WaterCounter()

        WellnessTaskList(list = wellnessViewModel.task,
            onCheckedTask = {task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task -> wellnessViewModel.remove(task)})
    }
}

//private fun getWellnessTask() = List(30){ it -> Well}