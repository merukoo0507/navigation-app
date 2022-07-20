package com.example.navigation_example

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

        var usernameDeepLink = navArgs.username
        usernameDeepLink?.let {
            edt_username.setText(it)
        }

        btn_2_third.setOnClickListener {
            var username = edt_username.text.toString()
            var password = edt_password.text.toString()

            // 跳頁動作代入參數
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(username, password)
            findNavController().navigate(action)
        }
    }
}