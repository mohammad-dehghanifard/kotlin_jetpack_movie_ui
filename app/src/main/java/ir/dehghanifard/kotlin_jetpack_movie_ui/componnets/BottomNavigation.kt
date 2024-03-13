package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.dehghanifard.kotlin_jetpack_movie_ui.data.NavigationItems
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppGray
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppRed
@Preview
@Composable
fun BottomNavigation(){
    val navItems = listOf(NavigationItems.Home,NavigationItems.Video,NavigationItems.Favorite,NavigationItems.User)
    var selected by remember { mutableIntStateOf(0) }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(AppGray)
        .padding(25.dp, 15.dp)){
        LazyRow(modifier = Modifier
            .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            items(navItems.size) {
                val item = navItems[it]

                Row(modifier = Modifier.fillMaxSize()
                    .clip(RoundedCornerShape(16.dp))
                    .background(if(selected == it) AppRed else Color.Transparent)
                    .padding(4.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = {selected = it }) {
                            Icon(
                                painterResource(id = item.icon),
                                contentDescription = null,
                                modifier = Modifier.size(22.dp)
                            )
                    }
                    if(selected == it){
                        Text(text = item.title, color = Color.White)
                    }

                }

            }

        }
    }
    }

