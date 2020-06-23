package ru.elsu.conference.ui.members

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.elsu.conference.R

class MemberFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         super.onCreateView(inflater, container, savedInstanceState)

        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.GONE

        return  inflater.inflate(R.layout.fr_member, container, false)
    }
}