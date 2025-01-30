package com.astrotify.aciirunning.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.astrotify.aciirunning.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(mainRepository: MainRepository): ViewModel() {

}