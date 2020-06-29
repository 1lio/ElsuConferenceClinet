package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.google.android.material.bottomappbar.BottomAppBar
import ru.elsu.conference.MainActivity
import ru.elsu.conference.R

class BottomView : BottomAppBar {

    constructor(context: Context) : super(context)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)
    constructor(context: Context, attr: AttributeSet, defStyle: Int) : super(
        context,
        attr,
        defStyle
    )


    /*   // item navigation in androidx.navigation
   override fun onOptionsItemSelected(item: MenuItem): Boolean {
       val navController = findNavController(R.id.hostFragment)
       return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
   }*/


    init {

        //  val navController = (context as MainActivity).findNavController(R.id.hostFragment)

        this.setOnMenuItemClickListener {
            //      it.onNavDestinationSelected(navController)
            true
        }
    }
}