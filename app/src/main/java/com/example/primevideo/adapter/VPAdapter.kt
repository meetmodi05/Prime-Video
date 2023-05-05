package com.example.primevideo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.primevideo.ui.view.fragment.MoreDetailFragment
import com.example.primevideo.ui.view.fragment.RelatedFragment

class VPAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return numTab
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return RelatedFragment()
            1 -> return MoreDetailFragment()
        }
        return Fragment()
    }

    companion object {
        private const val numTab: Int = 2
    }
}