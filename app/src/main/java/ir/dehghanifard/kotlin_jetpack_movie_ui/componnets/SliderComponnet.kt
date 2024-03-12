package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import ir.dehghanifard.kotlin_jetpack_movie_ui.data.FakeData

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun ShowSlider(){
    val lazyState = rememberLazyListState()
    val sliderHeight = 340.dp
    Box(modifier = Modifier
        .fillMaxSize()
        .height(sliderHeight)) {
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
    }
}
