package com.example.primevideo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.primevideo.Model.Results
import com.example.primevideo.R
import com.example.primevideo.databinding.RecommendedMoviesLayoutBinding

class TopRatedMovieAdapter(var topRatedMovieList: ArrayList<Results>) :
    RecyclerView.Adapter<TopRatedMovieAdapter.MyHolder>() {

    private val resultsList: ArrayList<Results> = arrayListOf()

    class MyHolder(var mContext: Context, var binding: RecommendedMoviesLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            parent.context,
            RecommendedMoviesLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return topRatedMovieList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        Glide.with(holder.mContext)
            .load("https://image.tmdb.org/t/p/w780${topRatedMovieList[position].posterPath}")
            .placeholder(
                ContextCompat.getDrawable(holder.mContext, R.drawable.family_man)
            ).override(512)
            .into(holder.binding.ivShapeableImageView)
    }

    fun setList(list: List<Results>) {
        resultsList.clear()
        resultsList.addAll(list)
        notifyDataSetChanged()
    }

}
