package ru.elsu.conference.view

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.google.android.material.bottomappbar.BottomAppBar
import ru.elsu.conference.R

class BottomView : BottomAppBar {

    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)

    init {
        // overflowIcon!!.setColorFilter(ContextCompat.getColor(context, R.color.color_white), PorterDuff.Mode.SRC_ATOP)
        replaceMenu(R.menu.menu)
        fabAlignmentMode = FAB_ALIGNMENT_MODE_END
        backgroundTint = ContextCompat.getColorStateList(context, R.color.colorPrimary)
    }
}