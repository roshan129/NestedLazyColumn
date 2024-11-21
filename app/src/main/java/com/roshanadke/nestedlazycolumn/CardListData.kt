package com.roshanadke.nestedlazycolumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

data class CardListData(
    val header: String? = null,
    val list: List<String> = mutableListOf()
)

