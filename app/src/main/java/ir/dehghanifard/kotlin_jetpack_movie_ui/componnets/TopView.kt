package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import ir.dehghanifard.kotlin_jetpack_movie_ui.R
import ir.dehghanifard.kotlin_jetpack_movie_ui.data.FakeData
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppDark
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppRed
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppWhite

@Preview()
@OptIn(ExperimentalSnapperApi::class)
@Composable
fun TopView(){
    val lazyState = rememberLazyListState()
    val sliderHeight = 340.dp
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(sliderHeight)) {
        // slider items
        LazyRow(
            state = lazyState,
            flingBehavior = rememberSnapperFlingBehavior(lazyState),
            modifier = Modifier
                .fillMaxWidth()
                .height(sliderHeight)
        ) {
            items(FakeData.sliderList.size) {
                Image(
                    painterResource(id = FakeData.sliderList[it].image) ,
                    modifier = Modifier.fillParentMaxSize(),
                    contentScale = ContentScale.Crop,
                    contentDescription = null)
            }
        }
        // gradiant
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Brush.verticalGradient(listOf(Color.Transparent, AppDark)))
                .height(sliderHeight)
                .align(Alignment.BottomCenter)
        )
        // top text filter
        Box(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.TopCenter)) {
            TextFilter()
        }

        // logo and title
        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomEnd)
            .padding(25.dp)){
            //logo
            Image(painterResource(id = R.drawable.logo) , contentDescription =  null)
            Spacer(modifier = Modifier.width(8.dp))
            // title
            Column(modifier = Modifier.align(Alignment.CenterVertically).weight(1f)) {
                Text(text = "Available Now", color = AppWhite)
                Text(text = "Watch Joker", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Icon(
                painterResource(id = R.drawable.ic_play_cicle),
                modifier = Modifier.size(50.dp).align(Alignment.CenterVertically),
                contentDescription =  null,
                tint = AppRed,)
        }
    }
}



