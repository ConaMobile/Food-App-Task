package com.conamobile.foodapp.presenter

import kotlinx.coroutines.flow.Flow

interface SplashScreenViewModel {
    val openNextScreenFlow: Flow<Unit>
}