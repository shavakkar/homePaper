package com.batuka.homepaper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View

class ImagesFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Images"
    }
}