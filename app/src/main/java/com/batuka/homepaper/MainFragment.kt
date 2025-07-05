package com.batuka.homepaper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        view.findViewById<FloatingActionButton>(R.id.btnAdd).setOnClickListener {
            // Navigate to Images fragment or perform your action
            findNavController().navigate(R.id.action_mainFragment_to_imagesFragment)
        }
        return view
    }
}
