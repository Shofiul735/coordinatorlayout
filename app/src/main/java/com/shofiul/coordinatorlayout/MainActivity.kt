package com.shofiul.coordinatorlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.appbar.AppBarLayout
import com.shofiul.coordinatorlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appBar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener {
                appBarLayout, verticalOffset ->

            var totalScroll = appBarLayout.totalScrollRange
            if(totalScroll+verticalOffset == 0){
                binding.collapsingToolbar.title = "Title"
            }else{
                binding.collapsingToolbar.title = ""
            }

        })

    }
}