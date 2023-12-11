package com.example.appdocbao_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appdocbao_kotlin.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var bottom_nav: BottomNavigationView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        initView()
    }

//    private fun initView() {
//        val bottom_nav = findViewById<BottomNavigationView>(R.id.bottom_nav)
//        val nav_host_fragment = findNavController(R.id.nav_host_fragment)
//
//        bottom_nav.setupWithNavController(nav_host_fragment)
//    }
}