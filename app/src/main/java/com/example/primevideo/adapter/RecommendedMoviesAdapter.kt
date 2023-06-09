package com.example.primevideo.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.primevideo.model.Results
import com.example.primevideo.R
import com.example.primevideo.databinding.RecommendedMoviesLayoutBinding
import com.example.primevideo.ui.view.home.RecommendedMoviesDetail

class RecommendedMoviesAdapter(private var imgList: ArrayList<Results>) :
    Adapter<RecommendedMoviesAdapter.MyHolder>() {

    private val resultsList: ArrayList<Results> = arrayListOf()

    fun setList(list: List<Results>) {
        resultsList.clear()
        resultsList.addAll(list)
        notifyDataSetChanged()
    }

    class MyHolder(var mContext: Context, var binding: RecommendedMoviesLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyHolder {
        return MyHolder(
            parent.context, RecommendedMoviesLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        Glide.with(holder.mContext)
            .load("https://image.tmdb.org/t/p/w780${imgList[position].posterPath}").placeholder(
                ContextCompat.getDrawable(holder.mContext, R.drawable.family_man)
            ).override(512).into(holder.binding.ivShapeableImageView)
        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity(
                Intent(
                    holder.itemView.context, RecommendedMoviesDetail::class.java
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return imgList.size
    }
}