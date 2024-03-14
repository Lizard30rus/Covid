package com.example.feature_alcohol.di

import com.example.core_common.scope.AlcoholScope
import com.example.feature_alcohol.detail.AlcoholDetailViewModel
import com.example.feature_alcohol.list.AlcoholListViewModel
import dagger.Subcomponent

@Subcomponent(modules = [AlcoholModule::class])
@AlcoholScope
interface AlcoholComponent {

    fun getListViewModel(): AlcoholListViewModel

    fun getDetailsViewModel() :AlcoholDetailViewModel

}