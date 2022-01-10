package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentEditLogBinding


class EditLogFragment : Fragment() {

    private lateinit var viewModel: EditLogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEditLogBinding>(
            inflater,
            R.layout.fragment_edit_log,
            container,
            false
        )

        viewModel = ViewModelProviders.of(this).get(EditLogViewModel::class.java)

        binding.backToAdminHome.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_editLogFragment_to_adminHomeFragment))


        binding.reset.setOnClickListener@Suppress("UNUSED_ANONYMOUS_PARAMETER"){
            binding.radioButtonIn.isSelected = false
            binding.radioButtonOut.isSelected = false
            binding.VisitorName.setText("")
            binding.VisitorTime.setText("")

        }

        binding.submit.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_editLogFragment_to_viewLogFragment))


        return binding.root
    }


}