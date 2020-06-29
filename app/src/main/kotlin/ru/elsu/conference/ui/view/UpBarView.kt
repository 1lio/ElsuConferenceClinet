package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_up_bar.view.*
import ru.elsu.conference.R
import java.util.*

class UpBarView : LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_up_bar, this)
        "СОБЫТИЕ".setTitleText()
    }

    private fun String.setTitleText() {
        toUpperCase(Locale.ROOT)
        title.text = this

    }

}