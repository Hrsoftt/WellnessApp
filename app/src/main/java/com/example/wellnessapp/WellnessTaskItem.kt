package com.example.wellnessapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wellnessapp.ui.theme.WellnessAppTheme

@Composable
fun WellnessTaskItem(
    taskName : String,
    checked: Boolean,
    onCheckedChanged: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier =Modifier
){
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = taskName ,
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        )

        Checkbox(checked = checked, onCheckedChange = onCheckedChanged )

        IconButton(onClick = onClose) {
            Icon(imageVector = Icons.Filled.Close, contentDescription = "Close")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview2(){
    WellnessAppTheme {
       WellnessTaskItem(taskName = "Task 1", onClose = { /*TODO*/ }, onCheckedChanged = { /*TODO*/ }, checked = false )
    }
}