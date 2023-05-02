package com.example.primevideo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.primevideo.databinding.ItemViewLayoutBinding

class ViewPagerAdapter( private val images: List<Int>) :
    Adapter<ViewPagerAdapter.ViewPagerHolder>() {
    class ViewPagerHolder(var binding: ItemViewLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            ItemViewLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.binding.ivItemView.setImageResource(images[position])

    }

}
