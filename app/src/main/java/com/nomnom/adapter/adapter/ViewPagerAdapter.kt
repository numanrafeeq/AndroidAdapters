package com.nomnom.adapter.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.gson.Gson
import com.nomnom.adapter.fragments.AdapterInfoFragment
import com.nomnom.adapter.fragments.ArrayAdapterFragment
import com.nomnom.adapter.fragments.BaseAdapterFragment
import com.nomnom.adapter.fragments.CursorAdapterFragment
import com.nomnom.adapter.fragments.ExpandableListAdapterFragment
import com.nomnom.adapter.fragments.FragmentPagerAdapterFragment
import com.nomnom.adapter.fragments.FragmentStatePagerAdapterFragment
import com.nomnom.adapter.fragments.PagerAdapterFragment
import com.nomnom.adapter.fragments.RecyclerViewAdapterFragment
import com.nomnom.adapter.fragments.RecyclerViewListAdapterFragment
import com.nomnom.adapter.fragments.SimpleAdapterFragment
import com.nomnom.adapter.fragments.SpinnerAdapterFragment
import com.nomnom.adapter.utils.MyData

class ViewPagerAdapter(activity: AppCompatActivity, private val itemsCount: Int) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = itemsCount

    override fun createFragment(position: Int): Fragment {

        val infoList = MyData.adapterList

        return when (position) {
            0 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[0]))
            1 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[1]))
            2 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[2]))
            3 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[3]))
            4 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[4]))
            5 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[5]))
            6 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[6]))
            7 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[7]))
            8 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[8]))
            9 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[9]))
            10 -> AdapterInfoFragment.newInstance(Gson().toJson(infoList[10]))
            else -> Fragment()
        }
    }
}