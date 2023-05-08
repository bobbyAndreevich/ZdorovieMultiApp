package com.example.zdoroviemultiapp.workout.domain.entities

import com.example.zdoroviemultiapp.workout.domain.enums.ExerciseType
import java.util.*

data class Exercise (

    val name: String,

    val description: String,

    val approaches: List<Approach>,

    val dateTime: Date,

    val uid: String,

    val type: ExerciseType
)


