package com.example.fragmentspractice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragmentspractice.R
import com.example.fragmentspractice.databinding.FragmentProfileBinding

class ProfileFragment: Fragment(R.layout.fragment_profile){
    private lateinit var binding: FragmentProfileBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding  = FragmentProfileBinding.bind(view)
        binding.button.setOnClickListener { (requireActivity() as CanHandleClick).onButtonClick() }
    }

    interface CanHandleClick{
        fun onButtonClick()
    }

    interface CanNavigateToProfile{

    }
}