package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment: Fragment(R.layout.fragment_second) {
    val navArgs: SecondFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var usernameDeepLink = navArgs.userName
        usernameDeepLink?.let {
            edt_arg1.setText(it)
        }

        btn_2_third.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(edt_arg1.text.toString(), edt_arg2.text.toString())
            findNavController().navigate(action)
        }
    }
}