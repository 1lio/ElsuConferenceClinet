package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.bottomappbar.BottomAppBar

class BottomView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : BottomAppBar(context, attr, defStyle) {

    init {

        //  val navController = (context as MainActivity).findNavController(R.id.hostFragment)

        this.setOnMenuItemClickListener {
            //      it.onNavDestinationSelected(navController)
            true
        }
    }
}