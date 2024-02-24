package com.example.fragmentspractice

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentspractice.databinding.SecondActivityBinding
import com.example.fragmentspractice.fragments.ProfileFragment

class SecondActivity: AppCompatActivity(), ProfileFragment.CanHandleClick{
    private lateinit var binding: SecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        supportFragmentManager.beginTransaction().add(binding.root.id, ProfileFragment()).commit()
    }

    override fun onButtonClick() {
        Toast.makeText(this, "INTERFACES ARE COOL", Toast.LENGTH_SHORT).show()
    }
}