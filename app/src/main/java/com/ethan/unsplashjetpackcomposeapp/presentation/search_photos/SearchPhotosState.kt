package com.ethan.unsplashjetpackcomposeapp.presentation.search_photos

import com.ethan.unsplashjetpackcomposeapp.domain.model.Photo

data class SearchPhotosState(
    val isLoading: Boolean = false,
    val photos: List<Photo> = emptyList(),
    val error: String? = null
)
