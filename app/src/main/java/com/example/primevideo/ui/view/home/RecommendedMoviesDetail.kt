package com.example.primevideo.ui.view.home

import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import com.bumptech.glide.Glide
import com.example.nourishinggeniusstudent.ui.view.base.BaseActivity
import com.example.primevideo.R
import com.example.primevideo.adapter.VPAdapter
import com.example.primevideo.databinding.ActivityRecommendedMoviesDetailBinding
import com.example.primevideo.ui.viewModel.HomeViewModel
import com.google.android.material.tabs.TabLayoutMediator


class RecommendedMoviesDetail : BaseActivity() {
    private lateinit var binding: ActivityRecommendedMoviesDetailBinding
    private val viewModel by lazy { HomeViewModel(this@RecommendedMoviesDetail) }
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecommendedMoviesDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        imageLoad()
        tabLayout()
        println(viewModel.dataLive)
    }

    private fun tabLayout() {
        val detailArray = arrayOf(
            "Related", "More Detail"
        )
        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = VPAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = detailArray[position]
        }.attach()
    }

    private fun imageLoad() {
        Glide.with(this).load(AppCompatResources.getDrawable(this, R.drawable.jalsa))
            .override(1280, 685).into(binding.ivPoster)
    }
}