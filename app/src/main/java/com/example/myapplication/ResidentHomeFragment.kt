package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentAdminHomeBinding
import com.example.myapplication.databinding.FragmentResidentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ResidentHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResidentHomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentResidentHomeBinding>(
            inflater,
            R.layout.fragment_resident_home,
            container,
            false
        )

        binding.logOutButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_residentHomeFragment2_to_homeFragment)
        )

        binding.logButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_residentHomeFragment2_to_viewLogFragment)
        )

        binding.cctvButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_residentHomeFragment2_to_cctvFragment)
        )




        return binding.root
    }
}