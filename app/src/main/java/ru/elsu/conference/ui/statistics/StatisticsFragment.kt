package ru.elsu.conference.ui.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import ru.elsu.conference.R

class StatisticsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        super.onCreateView(inflater, group, state)
        return inflater.inflate(R.layout.fr_statistics, group, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

  /*      // Видимость кнопки
        val params = fab.layoutParams as CoordinatorLayout.LayoutParams

            params.anchorId = View.NO_ID
            fab.layoutParams = params
            fab.visibility = View.GONE
        */

    }
}