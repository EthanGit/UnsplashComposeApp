package com.ethan.unsplashjetpackcomposeapp.presentation.photo_detail

import com.ethan.unsplashjetpackcomposeapp.domain.model.PhotoDetail

data class PhotoDetailState(
    val isLoading: Boolean = false,
    val photoDetail: PhotoDetail? = null,
    val error: String? = null
)
