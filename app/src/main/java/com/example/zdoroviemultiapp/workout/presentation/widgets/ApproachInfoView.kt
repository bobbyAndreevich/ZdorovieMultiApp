package com.example.zdoroviemultiapp.workout.presentation.widgets

import android.content.Context
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.zdoroviemultiapp.R
import com.example.zdoroviemultiapp.databinding.ApproachInfoLayoutBinding
import com.example.zdoroviemultiapp.workout.domain.entities.Approach

class ApproachInfoView(context: Context) : ConstraintLayout(context) {

    private val binding = ApproachInfoLayoutBinding.inflate(LayoutInflater.from(context), this, true)

    private lateinit var approach : Approach

    constructor(context: Context, approach: Approach) : this(context) {
        this.approach = approach
        parseApproach()
    }

    private fun parseApproach() {
        with(binding) {
            label.text = context.getString(R.string.approach_index_format, approach.index)

            if (!approach.repeats.isNullOrEmpty()) {
                repeats.text = approach.repeats
                repeats.visibility = VISIBLE
            }

            if (!approach.duration.isNullOrEmpty()) {
                duration.text = approach.duration
                duration.visibility = VISIBLE
            }

            if (!approach.power.isNullOrEmpty()) {
                power.text = approach.power
                power.visibility = VISIBLE
            }
        }
    }
}