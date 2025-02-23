package com.example.modul13

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember


fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = getWellnessTasks() // Remove remember from here
) {
    val rememberedList = remember { list } // Use remember inside the function

    LazyColumn(
        modifier = modifier
    ) {
        items(rememberedList) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}

