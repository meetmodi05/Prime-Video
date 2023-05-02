package com.example.primevideo.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.primevideo.Model.MoviesModel
import com.example.primevideo.databinding.ItemViewLayoutBinding

class ImageAdapter(
 private var imageList: ArrayList<MoviesModel>
) : Adapter<ImageAdapter.IVHolder>() {
    class IVHolder(var binding: ItemViewLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IVHolder {
        return IVHolder(
            ItemViewLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: IVHolder, position: Int) {
        holder.binding.ivItemView.setImageResource(imageList[position].image)
    }
}
