package com.ethan.unsplashjetpackcomposeapp.data.repository

import com.ethan.unsplashjetpackcomposeapp.data.remote.PhotoDetailDto
import com.ethan.unsplashjetpackcomposeapp.data.remote.SearchPhotosResultDto
import com.ethan.unsplashjetpackcomposeapp.data.remote.UnsplashApi
import com.ethan.unsplashjetpackcomposeapp.domain.repository.PhotoRepository
import javax.inject.Inject

class PhotoRepositoryImpl @Inject constructor(
    private val api: UnsplashApi,
) : PhotoRepository {
    override suspend fun searchPhotos(query: String): SearchPhotosResultDto {
        return api.searchPhotos(query)
    }

    override suspend fun getPhotoById(photoId: String): PhotoDetailDto {
        return  api.getPhotoById(photoId)
    }
}
