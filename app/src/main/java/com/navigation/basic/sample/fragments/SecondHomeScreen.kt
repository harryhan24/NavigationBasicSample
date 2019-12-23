package com.navigation.basic.sample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.navigation.basic.sample.NavMainDirections
import com.navigation.basic.sample.R
import kotlinx.android.synthetic.main.screen_second_home.view.*


class SecondHomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.screen_second_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_second_home.setOnClickListener {
            val navDirection: NavDirections = NavMainDirections.actionGlobalTwoDepthScreen(2)
            findNavController().navigate(navDirection)
        }
    }
}