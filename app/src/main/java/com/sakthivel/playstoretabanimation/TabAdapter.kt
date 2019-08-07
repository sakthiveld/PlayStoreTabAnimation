package com.sakthivel.playstoretabanimation

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TabAdapter(fragmentManager: FragmentManager,private val count:Int) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int) = SampleFragment()

    override fun getCount() = count

    override fun getPageTitle(position: Int) = when (position) {
        0 -> "Music"
        1 -> "Market"
        2 -> "Films"
        3 -> "Books"
        else -> "Android"
    }
}