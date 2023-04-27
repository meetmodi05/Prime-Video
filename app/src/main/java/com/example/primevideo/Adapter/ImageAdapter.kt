package com.example.primevideo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.primevideo.Model.MoviesModel
import com.example.primevideo.R
import com.example.primevideo.ui.HomeScreen

class ImageAdapter(
    private var context: HomeScreen, private var imageList: ArrayList<MoviesModel>
) : PagerAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemVIew: View = mLayoutInflater.inflate(R.layout.image_layout, container, false)
        val imageView: ImageView = itemVIew.findViewById(R.id.ivBanner) as ImageView
        imageView.setImageResource(imageList[position].image)
        container.addView(itemVIew)
        return itemVIew
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}
