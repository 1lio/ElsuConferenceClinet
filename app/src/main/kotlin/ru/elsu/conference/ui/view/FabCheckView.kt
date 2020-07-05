package ru.elsu.conference.ui.view

import android.content.Context
import android.graphics.PorterDuff
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.elsu.conference.R
import ru.elsu.conference.ui.MainActivity
import ru.elsu.conference.ui.extensions.setDrawable

class FabCheckView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyle: Int = 0
) : FloatingActionButton(context, attr, defStyle) {

    private val viewModel: FabCheckViewModel
    private var isCheckedFab = false

    init {

        setColorFilter(ContextCompat.getColor(context, R.color.white), PorterDuff.Mode.SRC_ATOP)
        this.setDrawable(R.drawable.ic_add) //ставим иконку по умолчанию
        val activity = context as MainActivity

        viewModel = ViewModelProvider(activity)[FabCheckViewModel::class.java]

        var count = 0
        viewModel.observeCheck(activity, Observer {

            if (it) {
                if (count == 0) {
                    this.setDrawable(R.drawable.ic_baseline_save_24)
                    count = 1
                }
            } else {
                if (count == 1) {
                    this.setDrawable(R.drawable.ic_add) // Меняем иконку обратно
                    count = 0
                }
            }

        })

        this.setOnClickListener {

            val navigation = activity.findNavController(R.id.hostFragment)

            // Перхожим на создание "События" и меняем вид FAB
            isCheckedFab = if (!isCheckedFab) {
                navigation.navigate(R.id.action_events_to_eventFragment)
                true
            } else {
                // При повторном нажатии сохраняем событие и возвращаемся назад
                navigation.navigate(R.id.events)
                false
            }
        }

//        val navController = activity.findNavController(R.id.hostFragment)
/*
        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            val state = when (destination.id) {

                R.id.action_events_to_eventFragment -> FragmentState.EVENT_LIST
                R.id.action_members_to_memberFragment -> FragmentState.MEMBER_LIST

                else -> FragmentState.STATISTICS

            }
            viewModel.setState(state)
        }*/

//        val host = this.findNavController()


    }


}