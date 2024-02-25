package com.nomnom.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nomnom.adapter.adapter.ViewPagerAdapter
import com.nomnom.adapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    val adapterTitlesList: MutableList<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initList()
        initComponents()


    }

    private fun initList() {

        adapterTitlesList.add("ArrayAdapter")
        adapterTitlesList.add("BaseAdapter")
        adapterTitlesList.add("SimpleAdapter")
        adapterTitlesList.add("CursorAdapter")
        adapterTitlesList.add("SpinnerAdapter")
        adapterTitlesList.add("ExpandableListAdapter")
        adapterTitlesList.add("PagerAdapter")
        adapterTitlesList.add("FragmentStatePagerAdapter")
        adapterTitlesList.add("FragmentPagerAdapter")
        adapterTitlesList.add("RecyclerView.Adapter")
        adapterTitlesList.add("RecyclerView's ListAdapter")


    }

    private fun initComponents() {

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        viewPager.adapter = ViewPagerAdapter(this, 11) // Assuming 2 fragments

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = adapterTitlesList[position]
        }.attach()


    }


}