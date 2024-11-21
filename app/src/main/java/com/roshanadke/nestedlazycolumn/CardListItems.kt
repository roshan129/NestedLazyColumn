package com.roshanadke.nestedlazycolumn

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainCardListScreen(
    modifier: Modifier = Modifier,
    list: List<CardListData>,
) {
    val state = rememberLazyListState()
    LazyColumn(
        state = state
    ) {
        list.forEach {
            item {
                it.header?.let {
                    Text(text = it)
                }
            }
            cardListItems(cardListData = it)
        }
    }
}

fun LazyListScope.cardListItems(
    cardListData: CardListData
) {
    items(cardListData.list) {
        ListItemCard(it)
    }
}

fun LazyListScope.someCard(
) {
    item {
        Card(modifier = Modifier.padding(12.dp)) {
            Text(text = "Some Card", modifier = Modifier.padding(12.dp))
        }
    }
}

@Composable
private fun ListItemCard(
    item: String
) {
    Card(
        modifier = Modifier.padding(8.dp),

        ) {
        Text(
            text = item,
            Modifier
                .fillMaxWidth()
                .padding(12.dp)
        )
    }


}