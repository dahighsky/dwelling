package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentAdminHomeBinding


class AdminHomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAdminHomeBinding>(
            inflater,
            R.layout.fragment_admin_home,
            container,
            false
        )

        binding.logOutButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_adminHomeFragment_to_homeFragment))

        binding.logButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_adminHomeFragment_to_viewLogFragment))

        binding.cctvButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_adminHomeFragment_to_cctvFragment))

        binding.editLogButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_adminHomeFragment_to_cctvFragment))
//hello


        return binding.root
    }


}