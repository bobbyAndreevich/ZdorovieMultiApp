package com.example.zdoroviemultiapp.workout.presentation.entities

import com.example.zdoroviemultiapp.workout.domain.entities.Approach
import com.example.zdoroviemultiapp.workout.domain.enums.ExerciseType

data class UIExercise (

    val name: CharSequence,

    val description: CharSequence,

    val approaches: List<Approach>,

    val dateTime: CharSequence,

    val uid: String,

    val type: ExerciseType
)