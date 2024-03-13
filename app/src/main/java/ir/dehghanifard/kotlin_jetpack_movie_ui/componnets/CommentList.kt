package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ir.dehghanifard.kotlin_jetpack_movie_ui.R
import ir.dehghanifard.kotlin_jetpack_movie_ui.data.FakeData
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppGold
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppLightGray

@Composable
fun CommentList() {
    LazyRow {
        items(FakeData.commentList.size) {
            val comment = FakeData.commentList[it]
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp, 0.dp),
                border = BorderStroke(1.dp, color = AppLightGray),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                )
            ) {
                Column(modifier = Modifier.padding(15.dp,10.dp)) {
                    // image and score
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        // image
                        Card(modifier = Modifier.size(60.dp), colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )) {
                            Image(
                                painterResource(id = comment.avatar ),
                                contentScale = ContentScale.Crop,
                                contentDescription = null)
                        }
                        Spacer(modifier = Modifier.width(6.dp))
                        // score
                        for ( i : Int in 1..comment.score) {
                            Icon(painterResource(id = R.drawable.ic_star)  , contentDescription = null, tint = AppGold)
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Card(modifier = Modifier
                        .width(230.dp)
                        .height(60.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                    ) {
                        Text(text = comment.content, color = Color.White)
                    }
                }
            }
        }
    }
}