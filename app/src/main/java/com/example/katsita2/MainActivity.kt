package com.example.katsita2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavView)
        val controller = findNavController(R.id.nav_host_fragment)

        val fragmentSet = setOf<Int>(
            R.id.thirdFragment,
            R.id.secondFragment,
            R.id.firstFragment
        )


        setupActionBarWithNavController(controller,AppBarConfiguration(fragmentSet))
        bottomNavView.setupWithNavController(controller)
    }

}