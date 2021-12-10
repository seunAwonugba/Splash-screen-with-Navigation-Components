package com.example.splashscreensample.onboarding.swipescreens

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.splashscreensample.R
import com.example.splashscreensample.databinding.FragmentFirstScreenBinding
import com.example.splashscreensample.databinding.FragmentThirdScreenBinding

class ThirdScreenFragment : Fragment(R.layout.fragment_third_screen) {
    private var _binding: FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentThirdScreenBinding.bind(view)

        binding.finishTvId.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingScreenFragment_to_homeFragment)

            //when user clicks finish, save onBoarding shared preference
            onBoardingSharedPreference()
        }

    }

    private fun onBoardingSharedPreference(){
        val sharedPref = requireActivity()?.getSharedPreferences(
            "onBoarding", Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()){
            putBoolean("firstTimeUser", true)
            apply()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}