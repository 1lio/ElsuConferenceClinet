package ru.elsu.conference.ui.events

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fr_events.*
import ru.elsu.conference.R

class EventListFragment : Fragment() {

    private val checkedCategories: ArrayList<Boolean> = arrayListOf(true, true, false, false, true)

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        super.onCreateView(inflater, group, state)

        requireActivity().findViewById<View>(R.id.sortView).setOnClickListener {
            alertCategory()
        }

        return inflater.inflate(R.layout.fr_events, group, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setCategories()
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


}