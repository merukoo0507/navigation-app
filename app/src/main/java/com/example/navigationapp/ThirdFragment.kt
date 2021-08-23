package com.example.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment: Fragment(R.layout.fragment_third) {
    private val args: ThirdFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_arg1.text = resources.getString(R.string.arg1_input) + args.arg1
        tv_arg2.text = resources.getString(R.string.arg2_input) + args.arg2
    }
}