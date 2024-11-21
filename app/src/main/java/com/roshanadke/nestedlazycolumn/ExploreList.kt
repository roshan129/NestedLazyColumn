package com.roshanadke.nestedlazycolumn

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ExploreList(onEventClick: (String) -> Unit) {
    val allEventCategories = listOf("pne", "nexgt")
    ExploreContent(allEventCategories, onEventClick)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExploreContent(allEventCategories: List<String>, onEventClick: (String) -> Unit) {
    val listState = rememberLazyListState()
    LazyColumn(
        state = listState
    ) {
        allEventCategories.map { categoryName ->
            stickyHeader {
                Text(text = "Header", modifier = Modifier.padding(bottom = 12.dp))
            }
            eventItem(listOf("one", "some", "next"), onEventClick)
        }
    }
}

fun LazyListScope.eventItem(
    eventList: List<String>,
    onEventClick: (String) -> Unit
) {
    items(eventList) { eventData ->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Column(
                Modifier.fillMaxWidth().padding(12.dp),
            ) {
               Text(text = "Some Image")


            }
        }
    }
}
