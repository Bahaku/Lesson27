package com.example.lesson27.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.lesson27.R

class InputNameCustomView(context: Context, attributeSet: AttributeSet) :
    ConstraintLayout(context, attributeSet) {

    init {
        View.inflate(context, R.layout.view_input_name, this)
    }
}