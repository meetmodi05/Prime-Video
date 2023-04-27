package com.example.primevideo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.bumptech.glide.Glide
import com.example.primevideo.R
import com.example.primevideo.databinding.ActivityRecommendedMoviesDetailBinding


class RecommendedMoviesDetail : AppCompatActivity() {
    lateinit var binding: ActivityRecommendedMoviesDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecommendedMoviesDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this).load(AppCompatResources.getDrawable(this,  R.drawable.jalsa))
            .override(1280,685)
            .into(binding.ivPoster)
    }
}