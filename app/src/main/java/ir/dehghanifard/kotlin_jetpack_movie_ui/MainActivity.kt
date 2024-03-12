package ir.dehghanifard.kotlin_jetpack_movie_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppDark
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppGray
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.Kotlin_jetpack_movie_uiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_jetpack_movie_uiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun MainView() {
    val lazyState = rememberLazyListState()
    val sliderHeight = 340.dp
    Box(modifier = Modifier
        .fillMaxSize()
        .background(AppDark)) {
        Column {
            Box(modifier = Modifier
                .fillMaxSize()
                .height(sliderHeight)) {
                LazyRow(
                    state = lazyState,
                    flingBehavior = rememberSnapperFlingBehavior(lazyState),
                    modifier = Modifier.fillMaxWidth().height(sliderHeight)
                ) {

                }
            }
        }
    }
}

