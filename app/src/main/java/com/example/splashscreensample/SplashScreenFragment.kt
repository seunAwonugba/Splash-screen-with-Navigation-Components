package com.example.splashscreensample

import android.annotation.SuppressLint
import android.content.Context
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
            //is user a first time user, i.e  if onBoardingSharedPreference is true,
            //take user to home fragment straight up
            //but if onBoardingSharedPreference is false, take user to onBoardingScreen

            if (onBoardingSharedPreference()){
                findNavController().navigate(R.id.action_splashScreenFragment_to_homeFragment)

            }else{
                findNavController().navigate(R.id.action_splashScreenFragment_to_onboardingScreenFragment2)
            }
        }, 2000)

    }

    //read shared onBoarding shared preference

    private fun onBoardingSharedPreference() : Boolean{
        val sharedPref = requireActivity()?.getSharedPreferences(
            "onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("firstTimeUser", false)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}