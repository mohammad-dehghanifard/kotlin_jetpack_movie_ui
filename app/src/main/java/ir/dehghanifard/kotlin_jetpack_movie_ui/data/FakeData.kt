package ir.dehghanifard.kotlin_jetpack_movie_ui.data

import ir.dehghanifard.kotlin_jetpack_movie_ui.R
import ir.dehghanifard.kotlin_jetpack_movie_ui.models.Slider

class FakeData {
    companion object {
        val sliderList = listOf<Slider>(
            Slider(image = R.drawable.joker0),
            Slider(image = R.drawable.joker1),
            Slider(image = R.drawable.joker2),
            Slider(image = R.drawable.joker3)
        )
    }
}