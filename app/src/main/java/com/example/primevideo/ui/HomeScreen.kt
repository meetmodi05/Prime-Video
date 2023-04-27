package com.example.primevideo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.primevideo.Adapter.ImageAdapter
import com.example.primevideo.Adapter.RecommendedMoviesAdapter
import com.example.primevideo.Model.MoviesModel
import com.example.primevideo.Model.RecommendedModel
import com.example.primevideo.R
import com.example.primevideo.databinding.ActivityHomeScreenBinding
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator


class HomeScreen : AppCompatActivity() {
    lateinit var binding: ActivityHomeScreenBinding
    private lateinit var imageModelArrayList: ArrayList<MoviesModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this).load(AppCompatResources.getDrawable(this, R.drawable.primevideo))
            .override(220, 220).into(binding.ivPrimeLogo)

        binding.tvAll.setOnClickListener {
            binding.tvAll.isSelected
        }
        binding.tvMovies.setOnClickListener {
            binding.tvMovies.isSelected
        }
        binding.tvTvShows.setOnClickListener {
            binding.tvTvShows.isSelected
        }


        imageModelArrayList = ArrayList()
        imageModelArrayList =
            (imageModelArrayList + MoviesModel(R.drawable.family_man)) as ArrayList<MoviesModel>
        imageModelArrayList =
            (imageModelArrayList + MoviesModel(R.drawable.farzi)) as ArrayList<MoviesModel>
        imageModelArrayList.add(MoviesModel(R.drawable.jalsa))
        imageModelArrayList.add(MoviesModel(R.drawable.jaibhim2))
        imageModelArrayList.add(MoviesModel(R.drawable.antman))


        binding.viewPager.adapter = ImageAdapter(this@HomeScreen, imageModelArrayList)
        binding.wormDotsIndicator.attachTo(binding.viewPager)
        setRecommendedAdapter()
    }

    private fun setRecommendedAdapter() {

        val imageList = ArrayList<RecommendedModel>()

        imageList.add(RecommendedModel(R.drawable.jalsa))
        imageList.add(RecommendedModel(R.drawable.jackryan))
        imageList.add(RecommendedModel(R.drawable.antman))

        binding.rvRecommendedMovies.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvRecommendedMovies.adapter = RecommendedMoviesAdapter(imageList)
    }
}