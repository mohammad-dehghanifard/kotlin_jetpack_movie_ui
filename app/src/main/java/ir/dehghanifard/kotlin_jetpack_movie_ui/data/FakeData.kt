package ir.dehghanifard.kotlin_jetpack_movie_ui.data

import ir.dehghanifard.kotlin_jetpack_movie_ui.R
import ir.dehghanifard.kotlin_jetpack_movie_ui.models.Comment
import ir.dehghanifard.kotlin_jetpack_movie_ui.models.Movie
import ir.dehghanifard.kotlin_jetpack_movie_ui.models.Slider

class FakeData {
    companion object {
        val sliderList = listOf<Slider>(
            Slider(image = R.drawable.joker0),
            Slider(image = R.drawable.joker1),
            Slider(image = R.drawable.joker2),
            Slider(image = R.drawable.joker3)
        )
        val filterText = listOf<String>("TV","Trailer","Animation","Series")
        val movieList = listOf<Movie>(
            Movie(image = R.drawable.movie_1, score = 5f),
            Movie(image = R.drawable.movie_2, score = 3.5f),
            Movie(image = R.drawable.movie_3, score = 3f),
            Movie(image = R.drawable.movie_4, score = 4.5f),
            Movie(image = R.drawable.movie_5, score = 5f),
            Movie(image = R.drawable.movie_6, score = 4.8f),
            Movie(image = R.drawable.movie_7, score = 4.3f),
        )
        val commentList = listOf<Comment>(
            Comment(avatar = R.drawable.profile1, score = 4, content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
            Comment(avatar = R.drawable.profile2, score = 5, content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
            Comment(avatar = R.drawable.profile3, score = 2, content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
            Comment(avatar = R.drawable.profile4, score = 3, content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
            Comment(avatar = R.drawable.profile5, score = 5, content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
        )
    }
}