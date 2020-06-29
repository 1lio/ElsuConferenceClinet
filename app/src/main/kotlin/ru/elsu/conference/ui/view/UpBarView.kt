package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import ru.elsu.conference.R

class UpBarView : LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_up_bar, this)
    }

}