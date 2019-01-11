package me.mfathy.movies.rater.domain.model

data class MovieEntity(
    val id: String = "",
    val title: String = "",
    val coverUrl: String = "",
    val description: String = "",
    var rating: Double = 0.0
)
