package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import androidx.navigation.findNavController
import com.google.android.material.bottomappbar.BottomAppBar
import ru.elsu.conference.R
import ru.elsu.conference.ui.MainActivity

class BottomView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : BottomAppBar(context, attr, defStyle) {

    init {
        val activity = context as MainActivity
        val navigation = activity.findNavController(R.id.hostFragment)

        this.setOnMenuItemClickListener {

            when (it.itemId) {
                R.id.events -> navigation.navigate(R.id.events)
                R.id.members -> navigation.navigate(R.id.members)
                R.id.statistics -> navigation.navigate(R.id.statistics)
            }
            true
        }

        val upBarView = activity.findViewById<UpBarView>(R.id.upBarView)

        navigation.addOnDestinationChangedListener { _, destination, _ ->

            val statisticsLabel = resources.getString(R.string.statistics)
            val fab = activity.findViewById<FabCheckView>(R.id.fab)

            if (destination.label.toString() == statisticsLabel) {
                fab.hide()
            }

            upBarView.title = destination.label.toString()
        }
    }
}