package com.example.feature_food.di

import com.example.core_common.scope.FoodScope
import com.example.feature_food.detail.FoodDetailViewModel
import com.example.feature_food.list.FoodListViewModel
import dagger.Subcomponent

@Subcomponent(modules = [FoodModule::class])
@FoodScope
interface FoodComponent {

    fun getListViewModel(): FoodListViewModel

    fun getDetailsViewModel() : FoodDetailViewModel

}