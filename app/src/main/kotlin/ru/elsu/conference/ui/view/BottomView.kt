package ru.elsu.conference.ui.view

import android.content.Context
import android.util.AttributeSet
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.android.material.bottomappbar.BottomAppBar
import ru.elsu.conference.R

class BottomView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : BottomAppBar(context, attr, defStyle) {

    init {

      //  val activity = context as MainActivity\

        this.setOnMenuItemClickListener {

            val navigation = findNavController()

            when (it.itemId) {

                R.id.events -> navigation.navigate(R.id.events)
                R.id.members -> navigation.navigate(R.id.members)

            }

            //      it.onNavDestinationSelected(navController) || true
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show()

            //    navController.navigate(it.itemId)
            true
            //   it.onNavDestinationSelected(navController)
        }
    }
}