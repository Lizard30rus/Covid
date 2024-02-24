package com.example.core_common.utils

import java.util.UUID

/** Создание нового уникального идентификатора (UUID) */
fun createUuid(): String =
    UUID.randomUUID().toString()