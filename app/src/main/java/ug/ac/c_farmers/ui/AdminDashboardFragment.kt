package ug.ac.c_farmers.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ug.ac.c_farmers.R
import ug.ac.c_farmers.databinding.FragmentAdminDashboardBinding


class AdminDashboardFragment : Fragment() {

   private var _binding: FragmentAdminDashboardBinding ?= null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAdminDashboardBinding.inflate(inflater,container, false)
//        return inflater.inflate(R.layout.fragment_admin_dashboard, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgFarmers.setOnClickListener(){
            findNavController().navigate(AdminDashboardFragmentDirections.actionAdminDashboardFragmentToFarmerDashboardFragment())
        }


    }


}