package com.ethan.unsplashjetpackcomposeapp.domain.repository

import com.ethan.unsplashjetpackcomposeapp.data.remote.PhotoDetailDto
import com.ethan.unsplashjetpackcomposeapp.data.remote.SearchPhotosResultDto

interface PhotoRepository {
    suspend fun searchPhotos(query: String): SearchPhotosResultDto

    suspend fun getPhotoById(photoId: String): PhotoDetailDto
}