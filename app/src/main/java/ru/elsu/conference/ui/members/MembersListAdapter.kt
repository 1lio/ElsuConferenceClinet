package ru.elsu.conference.ui.members

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import ru.elsu.conference.R
import ru.elsu.conference.api.model.Member

class MembersListAdapter(private val list: List<Member>) :
    RecyclerView.Adapter<MembersListAdapter.ViewHolder>() {

    private lateinit var ctx: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        ctx = parent.context
        val v = LayoutInflater.from(ctx).inflate(R.layout.item_member, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
        holder.itemView.setOnClickListener {

            it.findNavController().navigate(R.id.action_members_to_memberFragment)

        }
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        private val title: TextView = v.findViewById(R.id.titleMember)
        private val email: TextView = v.findViewById(R.id.emailMember)
        private val icon: AppCompatImageView = v.findViewById(R.id.iconMember)

        fun bind(index: Int) {

            title.text = list[index].name
            email.text = list[index].mail

            val image = when (list[index].icon) {
                "elsu" -> R.drawable.elsu
                "agtu" -> R.drawable.agtu
                "msuo" -> R.drawable.msuo
                else -> R.drawable.ic_member
            }



            icon.setImageDrawable(ContextCompat.getDrawable(ctx, image))
        }


    }
}