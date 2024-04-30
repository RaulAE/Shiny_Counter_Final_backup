package com.example.shiny_counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.shiny_counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_hunt, R.id.navigation_settings, R.id.navigation_saves
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val countUp: Button = findViewById<Button>(R.id.btn_counter_plus)
        val countDown: Button = findViewById<Button>(R.id.btn_counter_minus)
        val countDisplay: TextView = findViewById(R.id.counter_display)

        countUp.setOnClickListener {
            count += 1
            countDisplay.text = "$count"
        }

        countDown.setOnClickListener {
            if (count > 0) {
                count -= 1
                countDisplay.text = "$count"
            } else {
                Toast.makeText(this@MainActivity, "You cannot have negative encounters", Toast.LENGTH_SHORT).show()
            }
        }

    }
}