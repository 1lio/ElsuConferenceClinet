package ru.elsu.conference.ui.events

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fr_events.*
import ru.elsu.conference.R
import ru.elsu.conference.extensions.setDrawable

class EventListFragment : Fragment() {

    private val checkedCategories: ArrayList<Boolean> = arrayListOf(true, true, false, false, true)
    private lateinit var navigation: NavController
    private lateinit var fab: FloatingActionButton

    private var isCheckedFab = false



    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        super.onCreateView(inflater, group, state)

        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.VISIBLE
        sort.setOnClickListener { alertCategory() }

        navigation = requireActivity().findNavController(R.id.hostFragment)
        fab = requireActivity().findViewById(R.id.fab)
        fab.show()

        return inflater.inflate(R.layout.fr_events, group, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setCategories()

        fab.setOnClickListener {

            // Перхожим на создание "События" и меняем вид FAB
            isCheckedFab = if (!isCheckedFab) {
                navigation.navigate(R.id.action_events_to_eventFragment)
                fab.setDrawable(R.drawable.ic_baseline_save_24)
                true

            } else {
                // При повторном нажатии сохраняем событие и возвращаемся назад
                saveEvent()
                navigation.navigate(R.id.events)
                fab.setDrawable(R.drawable.ic_add) // Меняем иконку обратно
                false
            }
        }



    }

    private fun setCategories() {

        val categoryView =
            arrayOf(
                layoutStarted,
                layoutPlanned,
                layoutReplaced,
                layoutCanceled,
                layoutFinished
            )

        checkedCategories.forEachIndexed { index, visible ->
            if (visible) {
                categoryView[index].visibility = View.VISIBLE
                loadCategory(index)
            } else categoryView[index].visibility = View.GONE
        }
    }

    private fun loadCategory(id: Int) {}

    private fun alertCategory() {

        val tmpArray = checkedCategories

        val listener = DialogInterface.OnMultiChoiceClickListener { _, num, isChecked ->
            tmpArray[num] = isChecked
        }

        val dialog = AlertDialog.Builder(requireActivity())
            .setTitle(R.string.categories)
            .setMultiChoiceItems(R.array.events, checkedCategories.toBooleanArray(), listener)
            .setPositiveButton(R.string.ok) { _, _ ->
                tmpArray.forEachIndexed { index, b -> checkedCategories[index] = b }
                setCategories()
            }
            .setNegativeButton(R.string.cancel) { _, _ -> }

        dialog.show()
    }


    private fun saveEvent() {
        // saved
        Toast.makeText(activity, R.string.save_event, Toast.LENGTH_SHORT).show()
    }


}