package com.example.navigation_example

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_2_second.setOnClickListener {
            // Rebuild後，插件在編譯時會產生對應的代碼
            val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment()

            // 导航到目的地是使用 NavController 完成的，它是一个在 NavHost 中管理应用导航的对象。
            // 调用 navigate() ，以在各个目的地之间导航。
            findNavController().navigate(action)
        }
    }
}