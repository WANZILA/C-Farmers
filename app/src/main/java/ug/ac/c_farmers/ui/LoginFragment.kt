package ug.ac.c_farmers.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ug.ac.c_farmers.R
import ug.ac.c_farmers.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding ?= null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater,container, false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        /**n
         * // Set error text
         * passwordLayout.error = getString(R.string.error)
         *
         * // Clear error text
         * passwordLayout.error = null
         */

        binding.signIn.setOnClickListener {
            with(binding){

            }
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToAdminDashboardFragment())
        }



    }
}