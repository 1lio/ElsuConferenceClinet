package ru.elsu.conference.ui.view

import android.content.Context
import android.graphics.PorterDuff
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.google.android.material.bottomappbar.BottomAppBar
import ru.elsu.conference.R

class BottomView : BottomAppBar {

    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)
    constructor(context: Context, attr: AttributeSet,defStyle: Int) : super(context, attr,defStyle)


    /*   // item navigation in androidx.navigation
   override fun onOptionsItemSelected(item: MenuItem): Boolean {
       val navController = findNavController(R.id.hostFragment)
       return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
   }*/

    init {
        overflowIcon!!.setColorFilter(ContextCompat.getColor(context, R.color.white), PorterDuff.Mode.SRC_ATOP)
        replaceMenu(R.menu.menu)
        fabAlignmentMode = FAB_ALIGNMENT_MODE_END
        backgroundTint = ContextCompat.getColorStateList(context, R.color.colorPrimary)
    }
}