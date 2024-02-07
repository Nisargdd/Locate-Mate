package com.example.locatemate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            if(it.itemId == R.id.ic_guard1) {

                inflatefragment(GuardFragment.newInstance())

            }
            else if (it.itemId == R.id.ic_home){

                inflatefragment(HomeFragment.newInstance())
            }


            true

        }

    }

    private fun inflatefragment(newInstance : Fragment) {
        val transacion = supportFragmentManager.beginTransaction()
        transacion.replace(R.id.container, newInstance)
        transacion.commit()
    }
}