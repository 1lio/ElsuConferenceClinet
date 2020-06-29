package ru.elsu.conference.ui.events

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.elsu.conference.R

class EventFragment : Fragment(R.layout.fr_event_detail) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.GONE
    }
}