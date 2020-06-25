package ru.elsu.conference

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import kotlinx.android.synthetic.main.activity_main.bottomAppBar

// Start point. Single Activity Application.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) setSupportActionBar(bottomAppBar)  // add BottomAppBar
    }

    // Inflate menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // item navigation in androidx.navigation
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.hostFragment)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }
}
