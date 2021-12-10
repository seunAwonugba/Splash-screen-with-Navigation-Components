package com.example.splashscreensample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.splashscreensample.databinding.FragmentHomeBinding
import com.example.splashscreensample.databinding.FragmentOnboardingScreenBinding
import com.example.splashscreensample.onboarding.OnboardingViewPagerAdapter
import com.example.splashscreensample.onboarding.swipescreens.FirstScreenFragment
import com.example.splashscreensample.onboarding.swipescreens.SecondScreenFragment
import com.example.splashscreensample.onboarding.swipescreens.ThirdScreenFragment


class OnboardingScreenFragment : Fragment(R.layout.fragment_onboarding_screen) {
    private var _binding: FragmentOnboardingScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOnboardingScreenBinding.bind(view)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        val adapter = OnboardingViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPagerId.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}