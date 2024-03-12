package ir.dehghanifard.kotlin_jetpack_movie_ui
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.HomeMovieList
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.MovieListHeader
import ir.dehghanifard.kotlin_jetpack_movie_ui.componnets.TopView
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppDark
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
    }
}

