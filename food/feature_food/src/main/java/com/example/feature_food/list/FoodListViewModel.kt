package com.example.feature_food.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_food_api.models.FoodDomainModel
import com.example.core_food_api.repositories.FoodRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class FoodListViewModel @Inject constructor(
    private val foodRepository: FoodRepository
) : ViewModel() {


    /** Список еды */
    val foodList: StateFlow<List<FoodDomainModel>> get() = _foodList.asStateFlow()
    private val _foodList = MutableStateFlow(emptyList<FoodDomainModel>())


    init {
        viewModelScope.launch {
            foodRepository.getListFlow().collect {
                _foodList.emit(it)
            }
        }
    }

}