package com.example.navigation_example

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment: Fragment(R.layout.fragment_third) {
    private val args: ThirdFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_arg1.text = args.arg1
        tv_arg2.text = args.arg2
    }
}