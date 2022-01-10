package com.example.myapplication.ui.login

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentAdminLoginBinding

import com.example.myapplication.R

class AdminLoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAdminLoginBinding>(
            inflater,
            R.layout.fragment_admin_login,
            container,
            false
        )

        binding.login.setOnClickListener@Suppress("UNUSED_ANONYMOUS_PARAMETER"){
                if (binding.username.text.toString().equals("dahighsky")
                    &&
                    binding.password.text.toString().equals("dahighsky")
                ){
                    view?.findNavController()?.navigate(R.id.action_adminLoginFragment_to_adminHomeFragment)
                }
                else{
                    val text = "Invalid User details"
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(context?.applicationContext, text, duration)
                    toast.show()

                }
            }




        return binding.root
    }
}