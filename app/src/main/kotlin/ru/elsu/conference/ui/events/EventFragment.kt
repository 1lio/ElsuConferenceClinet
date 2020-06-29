package ru.elsu.conference.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.elsu.conference.R

class EventFragment : Fragment(R.layout.fr_event_full) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.GONE

    }
}