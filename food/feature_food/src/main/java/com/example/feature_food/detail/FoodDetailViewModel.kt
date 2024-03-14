package com.example.feature_food.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_food_api.models.FoodDomainModel
import com.example.core_food_api.repositories.FoodRepository
import com.example.core_navigation.routes.screens.alcohol.AlcoholDetailDestination
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class FoodDetailViewModel @Inject constructor(
    private val foodRepository: FoodRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val id = savedStateHandle.get<String>(AlcoholDetailDestination.ALCOHOL_ID)!!

    /** Список напитков */
    val foodDetail: StateFlow<FoodDomainModel?> get() = _foodDetail.asStateFlow()
    private val _foodDetail: MutableStateFlow<FoodDomainModel?> = MutableStateFlow(null)

    init {
        viewModelScope.launch {
            foodRepository.getFoodFlow(id).collect {
                _foodDetail.emit(it)
            }
        }

    }
}