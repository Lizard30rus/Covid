package com.example.core_common.scope

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AlcoholScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FoodScope