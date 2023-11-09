package ug.ac.c_farmers.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import ug.ac.c_farmers.R
import ug.ac.c_farmers.databinding.FragmentSignUpBinding
import ug.ac.c_farmers.ui.viewModel.MainViewModel


class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding ?= null
    val binding get() = _binding!!

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpBinding.inflate(inflater,container,false)

        return binding.root
//        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }


}