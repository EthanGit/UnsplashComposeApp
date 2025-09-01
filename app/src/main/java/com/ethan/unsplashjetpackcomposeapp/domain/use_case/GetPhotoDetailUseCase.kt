package com.ethan.unsplashjetpackcomposeapp.domain.use_case

import com.ethan.unsplashjetpackcomposeapp.common.NetworkResponse
import com.ethan.unsplashjetpackcomposeapp.data.remote.toPhotoDetail
import com.ethan.unsplashjetpackcomposeapp.domain.model.PhotoDetail
import com.ethan.unsplashjetpackcomposeapp.domain.repository.PhotoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetPhotoDetailUseCase @Inject constructor(
    private val repository: PhotoRepository,
) {
    // 画像ID -> 通信 -> 画像詳細情報
    operator fun invoke(photoId: String): Flow<NetworkResponse<PhotoDetail>> = flow {
        try {
            emit(NetworkResponse.Loading<PhotoDetail>())
            val photoDetail = repository.getPhotoById(photoId).toPhotoDetail()
            emit(NetworkResponse.Success<PhotoDetail>(photoDetail))
        } catch (e: Exception) {
            emit(NetworkResponse.Failure<PhotoDetail>(e.message.toString()))
        }
    }
}