package ru.elsu.conference.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.elsu.conference.R

class EventFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        super.onCreateView(inflater, group, state)

        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.GONE

        return inflater.inflate(R.layout.fr_event_full, group, false)
    }


}