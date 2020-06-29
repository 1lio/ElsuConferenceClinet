package ru.elsu.conference.ui.members

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fr_member_list.*
import ru.elsu.conference.R
import ru.elsu.conference.repository.Repository

class MemberListFragment : Fragment() {

    private lateinit var navigation: NavController
    private lateinit var fab: FloatingActionButton
    private lateinit var adapter: MembersListAdapter

    private var isCheckedFab = false

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, state: Bundle?): View? {
        super.onCreateView(inflater, group, state)

        navigation = requireActivity().findNavController(R.id.hostFragment)
        fab = requireActivity().findViewById(R.id.fab)
        fab.show()

        val list = Repository.getInstance().getMembers()
        adapter = MembersListAdapter(list)

        val sort = requireActivity().findViewById<View>(R.id.sortView)
        sort.visibility = View.GONE

        return inflater.inflate(R.layout.fr_member_list, group, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        memberRecycler.adapter = adapter

        fab.setOnClickListener {

            // Перхожим на создание "События" и меняем вид FAB
            isCheckedFab = if (!isCheckedFab) {
                navigation.navigate(R.id.action_members_to_memberFragment)
                true
            } else {
                // При повторном нажатии сохраняем событие и возвращаемся назад
                saveMember()
                navigation.navigate(R.id.members)
                false
            }

        }
    }

    private fun saveMember() {
        // saved
        Toast.makeText(activity, R.string.save_member, Toast.LENGTH_SHORT).show()
    }

}