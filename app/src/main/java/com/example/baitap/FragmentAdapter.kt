package com.example.baitap

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter (val activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    var fragmentList: MutableList<Fragment> = ArrayList()
        set(value){ fragmentList.addAll(value)}

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}