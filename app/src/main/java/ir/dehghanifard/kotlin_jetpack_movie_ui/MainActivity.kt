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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.BottomNavigation
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.HomeMovieList
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.MovieListHeader
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.TopView
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
@Composable
fun MainView() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(AppDark)) {
        Column(modifier = Modifier.fillMaxSize()) {
            // slider and filter
            TopView()
            // movie listHeader
            MovieListHeader()
            // movie list
            HomeMovieList()
        }
        // bottom navigation
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .align(Alignment.BottomCenter)
            .clip(RoundedCornerShape(50,50,0,0)),
        ) {
            BottomNavigation()
        }
    }
}

