package ru.elsu.conference

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private var isCheckedFab = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            // Используем bottomAppBar для навигации
            setSupportActionBar(bottomAppBar)

            // Инициализируем navController
            navController = findNavController(R.id.hostFragment)

            // Вешаем событие на FAB
            fab.setOnClickListener { setFabState() }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        isCheckedFab = false // Сбрасываем нажатие
        fab.setDrawable(R.drawable.ic_add_black_24dp)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }

    // Смена иконки на FAB
    private fun FloatingActionButton.setDrawable(id: Int) {
        this.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, id))
    }

    private fun setFabState() {

        // Перхожим на создание "События" и меняем вид FAB
        isCheckedFab = if (!isCheckedFab) {
            navController.navigate(R.id.action_events_to_eventFragment)
            fab.setDrawable(R.drawable.ic_baseline_save_24)
            true
        } else {
            // При повторном нажатии сохраняем событие и возвращаемся назад
            saveEvent()
            navController.navigate(R.id.events)
            fab.setDrawable(R.drawable.ic_add_black_24dp) // Меняем иконку обратно
            false
        }

    }

    private fun saveEvent() {
        // saved
        Toast.makeText(this, R.string.save_event, Toast.LENGTH_SHORT).show()
    }
}
