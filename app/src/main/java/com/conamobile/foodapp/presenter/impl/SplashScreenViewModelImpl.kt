package com.conamobile.foodapp.presenter.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.conamobile.foodapp.presenter.SplashScreenViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

class SplashScreenViewModelImpl : SplashScreenViewModel, ViewModel() {
    override val openNextScreenFlow = MutableSharedFlow<Unit>()

    init {
        viewModelScope.launch {
            delay(2000)
            openNextScreenFlow.emit(Unit)
        }
    }
}
