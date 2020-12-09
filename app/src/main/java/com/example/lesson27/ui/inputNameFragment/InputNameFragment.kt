package com.example.lesson27.ui.inputNameFragment

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.lesson27.R
import com.example.lesson27.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_inputname.*
import kotlinx.android.synthetic.main.view_input_name.view.*


class InputNameFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_inputname

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        tvWriter.animateText(getString(R.string.Your_name), 25)
    }

    private fun setupListeners() {
        viewInputName.etName.setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                openAgeScreen()
                return@OnEditorActionListener true
            }
            false
        })
        button.setOnClickListener{
            openAgeScreen()
        }
    }


    private fun openAgeScreen() {
        findNavController().navigate(R.id.action_inputNameFragment_to_ageFragment)
    }
}