package com.example.zdoroviemultiapp.core

import androidx.fragment.app.Fragment
import com.example.zdoroviemultiapp.MainActivity

abstract class AbstractFragment : Fragment() {

    private val activity: MainActivity
        get() {
            return requireActivity() as MainActivity
        }

    override fun onResume() {
        super.onResume()
        updateToolbar()
    }

    protected fun updateToolbar() {
        activity.title = getTitle()
    }

    fun showProgress() {

    }

    fun hideProgress() {

    }

    fun onBackPressed() : Boolean {
        TODO()
    }

    abstract fun getTitle(): String
}