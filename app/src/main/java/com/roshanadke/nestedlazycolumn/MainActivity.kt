package com.roshanadke.nestedlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshanadke.nestedlazycolumn.ui.theme.NestedLazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NestedLazyColumnTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    /* Column(
                         modifier = Modifier
                             .padding(innerPadding)

                     ) {
                         MainCardListScreen(
                             list =
                             listOf(
                                 CardListData(
                                     "Some Header", listOf("One", "Two", "Three"),
                                 ),
                                 CardListData(
                                     "Some Header 2", listOf("One", "Two", "Four"),
                                 ),
                                 CardListData(
                                     "Some Header 3", listOf("One", "Two", "Three"),
                                 ),
                             )
                         )
                     }*/

                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        LazyColumn(state = rememberLazyListState()) {
                            cardListItems(
                                cardListData = CardListData(
                                    header = "Header 1", list = listOf("One", "Two", "Three"),
                                )
                            )
                            item {
                                Card(modifier = Modifier.padding(12.dp)) {
                                    Text(text = "Some Item Card", modifier = Modifier.padding(12.dp))
                                }
                            }
                            cardListItems(
                                cardListData = CardListData(
                                    header = "Header 1", list = listOf("One", "Two", "Three"),
                                )
                            )
                            someCard()
                            cardListItems(
                                cardListData = CardListData(
                                    header = "Header 1", list = listOf("One", "Two", "Three"),
                                )
                            )
                            someCard()
                            cardListItems(
                                cardListData = CardListData(
                                    header = "Header 1", list = listOf("One", "Two", "Three"),
                                )
                            )
                        }

                    }

                }
            }
        }
    }
}

