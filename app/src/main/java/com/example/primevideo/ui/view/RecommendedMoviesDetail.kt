package com.example.primevideo.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.bumptech.glide.Glide
import com.example.primevideo.Adapter.VPAdapter
import com.example.primevideo.R
import com.example.primevideo.databinding.ActivityRecommendedMoviesDetailBinding
import com.google.android.material.tabs.TabLayoutMediator


class RecommendedMoviesDetail : AppCompatActivity() {
    private lateinit var binding: ActivityRecommendedMoviesDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecommendedMoviesDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this).load(AppCompatResources.getDrawable(this, R.drawable.jalsa))
            .override(1280, 685).into(binding.ivPoster)


        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = VPAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = detailArray[position]
        }.attach()
    }

    companion object {
        val detailArray = arrayOf(
            "Related", "More Detail"
        )
    }

}