package com.example.splashscreensample

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.splashscreensample.databinding.FragmentSplashScreenBinding


@SuppressLint("CustomSplashScreen")
class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {


    private var _binding: FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSplashScreenBinding.bind(view)

        //implement navigation on the on boarding screen

        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splashScreenFragment_to_onboardingScreenFragment2)
        }, 2000)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}