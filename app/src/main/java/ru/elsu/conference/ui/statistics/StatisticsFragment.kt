package ru.elsu.conference.ui.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*
import ru.elsu.conference.R

class StatisticsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        super.onCreateView(inflater, group, state)

        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.GONE

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.fab)
        fab.hide()

        return inflater.inflate(R.layout.fr_statistics, group, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*

        // Видимость кнопки
        val params = fab.layoutParams as CoordinatorLayout.LayoutParams
            params.anchorId = View.NO_ID
            fab.layoutParams = params
            fab.visibility = View.GONE
        */

    }
}