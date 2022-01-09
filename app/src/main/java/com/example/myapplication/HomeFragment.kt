package com.example.myapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        binding.buttonResidentLogIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_residentLoginFragment2))

        binding.buttonAdminLogIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_adminLoginFragment2))

        return binding.root
    }
    }
