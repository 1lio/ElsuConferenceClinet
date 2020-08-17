package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.view_up_bar.view.*
import ru.elsu.conference.R

class UpBarView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attr, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_up_bar, this)
    }

    var title: String
        get() = this.barTitle.text.toString()
        set(title) {
            this.barTitle.text = title
        }


    var isVisibleSort
        set(visible) {
            sortView.visibility = if (visible) View.VISIBLE else View.GONE
        }
        get() = sortView.isVisible

}