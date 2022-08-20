package com.example.openglesdemo01

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.openglesdemo01.databinding.ActivityMainBinding
import com.example.openglesdemo01.fragment.*

class MainActivity : AppCompatActivity() {

    private val viewBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val list = listOf(
            OneFragment(),
            TwoFragment(),
            ThreeFragment(),
            FourFragment(),
            FiveFragment(),
            SixFragment(),
            SevenFragment(),
            NineFragment(),
            EightFragment(),
        )
        val myAdapter = MyAdapter(list,supportFragmentManager,lifecycle)

        viewBinding.viewPager.adapter = myAdapter

    }
}