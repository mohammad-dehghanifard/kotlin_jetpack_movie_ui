package ir.dehghanifard.kotlin_jetpack_movie_ui.models

import androidx.annotation.DrawableRes

data class Comment(@DrawableRes val avatar : Int,val score: Int,val content : String)
