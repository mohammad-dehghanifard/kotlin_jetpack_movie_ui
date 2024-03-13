package ir.dehghanifard.kotlin_jetpack_movie_ui.componnets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.dehghanifard.kotlin_jetpack_movie_ui.ui.theme.AppGray

@Composable
fun ListHeader(title : String){
    Row(modifier = Modifier.padding(horizontal = 25.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = title, fontSize = 16.sp, color = Color.White, modifier = Modifier.weight(1f))
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "View all", fontSize = 14.sp, color = AppGray)
        }
    }
}