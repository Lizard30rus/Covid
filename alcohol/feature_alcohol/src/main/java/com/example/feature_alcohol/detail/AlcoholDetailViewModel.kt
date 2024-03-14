package com.example.feature_alcohol.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_alcohol_api.repository.AlcoholRepository
import com.example.core_navigation.routes.screens.alcohol.AlcoholDetailDestination
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class AlcoholDetailViewModel @Inject constructor(
    private val alcoholRepository: AlcoholRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val id = savedStateHandle.get<String>(AlcoholDetailDestination.ALCOHOL_ID)!!

    /** Список напитков */
    val alcoholDetail: StateFlow<AlcoholDomainModel?> get() = _alcoholDetail.asStateFlow()
    private val _alcoholDetail : MutableStateFlow<AlcoholDomainModel?> = MutableStateFlow(null)

    init {
        viewModelScope.launch {
            alcoholRepository.getAlcoholFlow(id).collect {
               _alcoholDetail.emit(it)
            }
        }
    }
}