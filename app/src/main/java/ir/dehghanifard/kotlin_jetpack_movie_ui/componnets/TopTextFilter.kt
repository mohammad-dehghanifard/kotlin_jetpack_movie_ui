package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import ir.dehghanifard.kotlin_jetpack_movie_ui.data.FakeData
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppWhite

@Composable
fun TextFilter(){
    var selectedFilterText by remember { mutableIntStateOf(0) }
// filter text
    LazyRow {
        // search button
        item {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = null, tint = Color.White)
            }
        }
        items(FakeData.filterText.size) {
            TextButton(
                onClick = { selectedFilterText = it },
            ) {
                Text(
                    text = FakeData.filterText[it],
                    color = if(selectedFilterText == it) Color.White else AppWhite
                )
            }
        }
    }
}