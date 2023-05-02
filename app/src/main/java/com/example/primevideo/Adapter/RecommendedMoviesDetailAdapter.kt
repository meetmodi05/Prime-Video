package com.example.primevideo.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.primevideo.Model.Results
import com.example.primevideo.databinding.RelatedLayoutBinding

class RecommendedMoviesDetailAdapter() : Adapter<RecommendedMoviesDetailAdapter.ViewHolder>() {
    class ViewHolder(var binding: RelatedLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Results) {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RelatedLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvDirector.text = holder.binding.tvDirector.toString()

    }
}