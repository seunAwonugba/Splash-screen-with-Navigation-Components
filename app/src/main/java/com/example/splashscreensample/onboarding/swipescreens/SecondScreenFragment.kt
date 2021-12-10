package com.example.splashscreensample.onboarding.swipescreens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.splashscreensample.R
import com.example.splashscreensample.databinding.FragmentFirstScreenBinding
import com.example.splashscreensample.databinding.FragmentSecondScreenBinding


class SecondScreenFragment : Fragment(R.layout.fragment_second_screen) {
    private var _binding: FragmentSecondScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSecondScreenBinding.bind(view)

        //reference view pager form activity
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPagerId)

        binding.next2TvId.setOnClickListener {
            viewPager?.currentItem = 2
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}