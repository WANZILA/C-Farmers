package ug.ac.c_farmers.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ug.ac.c_farmers.R
import ug.ac.c_farmers.databinding.FragmentFarmerDashboardBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FarmerDashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FarmerDashboardFragment : Fragment() {

    private var _binding: FragmentFarmerDashboardBinding ?= null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFarmerDashboardBinding.inflate(inflater,container, false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_farmer_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        findNavController().navigate(FarmerDashboardFragmentDirections.actionFarmerDashboardFragmentToAddFarmerFragment())

        binding.floatingActionButton.setOnClickListener() {
            findNavController().navigate(FarmerDashboardFragmentDirections.actionFarmerDashboardFragmentToAddFarmerFragment())
        }
    }



}