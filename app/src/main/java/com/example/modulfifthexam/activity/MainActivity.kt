package com.example.modulfifthexam.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.modulfifthexam.R
import com.example.modulfifthexam.fragment.CollectionsFragment
import com.example.modulfifthexam.fragment.HomeFragment
import com.example.modulfifthexam.fragment.MessagesFragment
import com.example.modulfifthexam.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var bottomNavView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        bottomNavView = findViewById(R.id.bottom_navigation_view)
        bottomNavView.setOnNavigationItemSelectedListener(this)
        bottomNavView.selectedItemId = R.id.bnv_home
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.bnv_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.fl_container, HomeFragment())
                    .commit()
                return true
            }
            R.id.bnv_collection -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_container, CollectionsFragment())
                    .commit()
                return true
            }
            R.id.bnv_message -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_container, MessagesFragment())
                    .commit()
                return true
            }
            R.id.bnv_search -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_container, SearchFragment())
                    .commit()
                return true
            }
        }
        return false
    }
}