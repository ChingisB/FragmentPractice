package com.example.fragmentspractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.example.fragmentspractice.databinding.ActivityMainBinding
import com.example.fragmentspractice.fragments.HomeFragment
import com.example.fragmentspractice.fragments.NotificationsFragment
import com.example.fragmentspractice.fragments.ProfileFragment
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener, ProfileFragment.CanHandleClick {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNav.setOnItemSelectedListener(this)
        supportFragmentManager.beginTransaction().add(binding.fragmentContainer.id, HomeFragment()).commit()
        binding.fragmentContainer
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val fragment = when(item.itemId){
            R.id.profile -> ProfileFragment()
            R.id.notifications -> NotificationsFragment()
            else -> HomeFragment()
        }
        supportFragmentManager.beginTransaction().replace(binding.fragmentContainer.id, fragment).addToBackStack(item.title.toString()).commit()
        return true
    }

    override fun onButtonClick() {
        Intent(this, SecondActivity::class.java).let(::startActivity)
    }


}