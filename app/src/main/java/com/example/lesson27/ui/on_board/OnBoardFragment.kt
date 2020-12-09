package com.example.lesson27.ui.on_board

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.lesson27.R
import com.example.lesson27.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboard.*

class OnBoardFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_onboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        button.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment_to_inputNameFragment)
        }
    }

}

