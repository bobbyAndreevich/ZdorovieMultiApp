package com.example.zdoroviemultiapp.workout.presentation.widgets

import android.content.Context
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavDestination
import com.example.zdoroviemultiapp.databinding.ExerciseInfoLayoutBinding
import com.example.zdoroviemultiapp.workout.presentation.entities.UIExercise

class ExerciseInfoView(context: Context) : ConstraintLayout(context) {

    private val binding = ExerciseInfoLayoutBinding.inflate(LayoutInflater.from(context), this, true)

    private lateinit var exercise: UIExercise

    constructor(context: Context, exercise: UIExercise) : this(context) {
        this.exercise = exercise
        parseExercise()
        NavDestination
    }

    fun setExercise(exercise: UIExercise) {
        this.exercise = exercise
        parseExercise()
    }

    private fun parseExercise() {
        with(binding) {
            dateTime.text = exercise.dateTime
            header.text = exercise.name
            description.text = exercise.description

            exercise.approaches.forEach { approach -> approachesContainer.addView(ApproachInfoView(context, approach)) }
        }
    }
}