package com.example.primevideo.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.primevideo.Model.RecommendedModel
import com.example.primevideo.databinding.RecommendedMoviesLayoutBinding
import com.example.primevideo.ui.RecommendedMoviesDetail

class RecommendedMoviesAdapter(var imageList: ArrayList<RecommendedModel>) :
    Adapter<RecommendedMoviesAdapter.MyHolder>() {
    class MyHolder(var binding: RecommendedMoviesLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(model: RecommendedModel) {
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyHolder {
        return MyHolder(
            RecommendedMoviesLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binding(imageList[position])
        Glide.with(holder.itemView.context).load(imageList[position].image).override(512, 512)
            .into(holder.binding.ivShapeableImageView)
        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity(
                Intent(
                    holder.itemView.context, RecommendedMoviesDetail::class.java
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}