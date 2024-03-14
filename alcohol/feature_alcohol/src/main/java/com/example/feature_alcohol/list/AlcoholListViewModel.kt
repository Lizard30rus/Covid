package com.example.feature_alcohol.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_alcohol_api.repository.AlcoholRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class AlcoholListViewModel @Inject constructor(
    private val alcoholRepository: AlcoholRepository
) : ViewModel() {

    /** Список напитков */
    val alcoholList: StateFlow<List<AlcoholDomainModel>> get() = _alcoholList.asStateFlow()
    private val _alcoholList = MutableStateFlow(emptyList<AlcoholDomainModel>())


    init {
        viewModelScope.launch {
            alcoholRepository.getListFlow().collect {
                _alcoholList.emit(it)
            }
        }
    }
}