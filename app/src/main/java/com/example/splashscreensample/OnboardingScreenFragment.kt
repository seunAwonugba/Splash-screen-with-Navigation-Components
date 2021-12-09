package com.example.splashscreensample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.splashscreensample.databinding.FragmentHomeBinding
import com.example.splashscreensample.databinding.FragmentOnboardingScreenBinding


class OnboardingScreenFragment : Fragment(R.layout.fragment_onboarding_screen) {
    private var _binding: FragmentOnboardingScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOnboardingScreenBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}