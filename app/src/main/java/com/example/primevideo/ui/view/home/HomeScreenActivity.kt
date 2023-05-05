package com.example.primevideo.ui.view.home

import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nourishinggeniusstudent.ui.view.base.BaseActivity
import com.example.primevideo.R
import com.example.primevideo.adapter.ImageAdapter
import com.example.primevideo.adapter.RecommendedMoviesAdapter
import com.example.primevideo.adapter.TopRatedMovieAdapter
import com.example.primevideo.databinding.ActivityHomeScreenBinding
import com.example.primevideo.model.Results
import com.example.primevideo.model.movie.MoviesModel
import com.example.primevideo.ui.viewModel.HomeViewModel


class HomeScreenActivity : BaseActivity() {
    lateinit var binding: ActivityHomeScreenBinding
    private val viewModel by lazy { HomeViewModel(this@HomeScreenActivity) }
    private lateinit var imageModelArrayList: ArrayList<MoviesModel>
    private var recommendedMoviesAdapter: RecommendedMoviesAdapter? = null
    private var topRatedMoviesAdapter: TopRatedMovieAdapter? = null
    private val recommendedList: ArrayList<Results> = arrayListOf()
    private val topRatedMovieList: ArrayList<Results> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        imageLoad()
        setOnClickListener()
        loadViewPager()
        setAdapter()
        setObservers()
        init()

    }

    private fun loadViewPager() {
        imageModelArrayList = ArrayList()
        imageModelArrayList =
            (imageModelArrayList + MoviesModel(R.drawable.family_man)) as ArrayList<MoviesModel>
        imageModelArrayList =
            (imageModelArrayList + MoviesModel(R.drawable.farzi)) as ArrayList<MoviesModel>
        imageModelArrayList.add(MoviesModel(R.drawable.jalsa))
        imageModelArrayList.add(MoviesModel(R.drawable.jaibhim2))
        imageModelArrayList.add(MoviesModel(R.drawable.antman))
    }

    private fun imageLoad() {
        Glide.with(this).load(AppCompatResources.getDrawable(this, R.drawable.primevideo))
            .override(220, 220).into(binding.ivPrimeLogo)
    }

    private fun setOnClickListener() {
        binding.tvAll.setOnClickListener {
            binding.tvAll.isSelected = true
            binding.tvMovies.isSelected = false
            binding.tvTvShows.isSelected = false
        }
        binding.tvMovies.setOnClickListener {
            binding.tvAll.isSelected = false
            binding.tvMovies.isSelected = true
            binding.tvTvShows.isSelected = false
        }
        binding.tvTvShows.setOnClickListener {
            binding.tvAll.isSelected = false
            binding.tvMovies.isSelected = false
            binding.tvTvShows.isSelected = true
        }
    }

    private fun init() {
        viewModel.isLoading.value = true
        viewModel.getList()
        viewModel.getTopRatedList()
    }

    private fun setObservers() {
        viewModel.dataLive.observe(this) {
            recommendedList.clear()
            recommendedList.addAll(it!!)
            recommendedMoviesAdapter?.setList(recommendedList)

        }
        viewModel.topRatedLive.observe(this) {
            topRatedMovieList.clear()
            topRatedMovieList.addAll(it!!)
            topRatedMoviesAdapter?.setList(topRatedMovieList)
        }
    }

    private fun setAdapter() {

        binding.viewPager.adapter = ImageAdapter(imageModelArrayList)
        binding.wormDotsIndicator.attachTo(binding.viewPager)

        binding.rvRecommendedMovies.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recommendedMoviesAdapter = RecommendedMoviesAdapter(recommendedList)
        binding.rvRecommendedMovies.adapter = recommendedMoviesAdapter

        binding.rvTopRatedMovies.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        topRatedMoviesAdapter = TopRatedMovieAdapter(topRatedMovieList)
        binding.rvTopRatedMovies.adapter = topRatedMoviesAdapter
    }
}