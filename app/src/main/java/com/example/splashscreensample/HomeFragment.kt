package com.example.splashscreensample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.splashscreensample.databinding.FragmentHomeBinding

//remember to remove splash fragment from navigation back stack and also on boardind


class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}