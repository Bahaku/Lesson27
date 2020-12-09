package com.example.lesson27.ui.age

import android.os.Bundle
import android.view.View
import com.example.lesson27.R
import com.example.lesson27.ui.base.BaseFragment
import com.example.lesson27.utils.AnimationUtils
import com.example.lesson27.utils.setSeekBarChangeListener
import kotlinx.android.synthetic.main.fragment_age.*

class AgeFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_age
    private var lastScale = 0f

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        tvAgeDesc.animateText(getString(R.string.how_old))
    }

    private fun setupListeners() {
        seekBar.setSeekBarChangeListener { scaleValue ->
            AnimationUtils.animateScale(imgRedMan, lastScale, scaleValue.toFloat())
            lastScale = scaleValue.toFloat()
            checkAge(scaleValue)
        }
    }


    private fun checkAge(scaleValue: Int) {
        val age = scaleValue / 6
        if (age == 16) {
            tvAge.text = getString(R.string.maxAge)
        } else if (age in 1..15) tvAge.text = age.toString()

        when (age) {
            in 1..4 -> tvAgeDesc.text = getString(R.string.deskOne)
            in 5..14 -> tvAgeDesc.text = getString(R.string.deskTwo)
            in 15..16 -> tvAgeDesc.text = getString(R.string.deskThree)
        }
    }
}