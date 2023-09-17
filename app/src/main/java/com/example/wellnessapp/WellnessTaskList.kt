package com.example.wellnessapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    onCloseTask: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    list: List<WellnessTask>
    ){
    
    LazyColumn(modifier = modifier){
        items(
            list,
            key = {task -> task.id}){ task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChanged = {checked -> onCheckedTask(task, checked)},
                onClose = {onCloseTask(task)})
        }
    }

}