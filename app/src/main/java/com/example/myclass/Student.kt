package com.example.myclass

import androidx.annotation.DrawableRes

data class Student(
    @DrawableRes val resID: Int,
    val name: String = "",
    val nim: String = "",
    val gpa: Double
)
