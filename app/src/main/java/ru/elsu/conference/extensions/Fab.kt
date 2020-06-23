package ru.elsu.conference.extensions

import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

// Смена иконки на FAB
fun FloatingActionButton.setDrawable(id: Int) {
    this.setImageDrawable(ContextCompat.getDrawable(this.context, id))
}
