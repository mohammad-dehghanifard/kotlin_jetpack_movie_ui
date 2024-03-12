package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.dehghanifard.kotlin_jetpack_movie_ui.R
import ir.dehghanifard.kotlin_jetpack_movie_ui.data.FakeData
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppGold
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppGray
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppWhite

@Composable
fun HomeMovieList() {
    LazyRow(modifier = Modifier.padding(horizontal = 25.dp)) {
        items(FakeData.movieList.size) {
            val movie = FakeData.movieList[it]
            // poster
            Card(
                modifier = Modifier
                    .width(165.dp)
                    .height(220.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(12)
            ) {
                Box() {

                    Image(
                        painterResource(id = movie.image),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop)

                    Card(
                        modifier = Modifier
                            .size(50.dp, 20.dp)
                            .align(Alignment.TopStart),
                        colors = CardDefaults.cardColors(
                            containerColor = AppGray
                        ),
                        shape = RoundedCornerShape(topStart = 12.dp, topEnd = 0.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painterResource(id = R.drawable.ic_star),
                                modifier = Modifier.padding(3.dp),
                                tint = AppGold,
                                contentDescription = null)

                            Text(text = movie.score.toString(), color = AppWhite, fontSize = 14.sp)
                        }
                    }
                }
            }
        }
    }
}