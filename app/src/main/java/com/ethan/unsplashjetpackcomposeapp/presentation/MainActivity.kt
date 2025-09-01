package com.ethan.unsplashjetpackcomposeapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ethan.unsplashjetpackcomposeapp.presentation.search_photos.SearchPhotosScreen
import com.ethan.unsplashjetpackcomposeapp.presentation.ui.theme.UnsplashJetpackComposeAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnsplashJetpackComposeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = ScreenRoute.SearchPhotoScreen.route,
                    ) {
                        // 画像検索画面
                        composable(route = ScreenRoute.SearchPhotoScreen.route) {
                            SearchPhotosScreen(navController)
                        }
                        // 画像詳細表示画面
                        composable(route = ScreenRoute.PhotoDetailScreen.route + "/{photoId}") {

                        }
                    }
                }
            }
        }
    }
}
