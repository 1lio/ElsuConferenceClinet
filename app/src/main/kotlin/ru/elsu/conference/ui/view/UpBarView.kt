package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_up_bar.view.*
import ru.elsu.conference.R
import java.util.*

class UpBarView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attr, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_up_bar, this)

    }


}