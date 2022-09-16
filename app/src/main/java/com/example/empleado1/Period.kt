package com.example.empleado1

import java.time.LocalDate


data class Period (
    val initialDate: LocalDate,
    val finalDate: LocalDate,
    val description: String
)