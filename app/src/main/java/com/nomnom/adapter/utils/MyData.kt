package com.nomnom.adapter.utils

import com.nomnom.adapter.model.AdapterItem

object MyData {

    val adapterList = listOf(
        AdapterItem(
            name = "01.ArrayAdapter",
            packageName = "android.widget.ArrayAdapter",
            releaseDate = "October 2008 (Android 1.0)",
            description = "A straightforward adapter for mapping items in a list or array to TextViews in a ListView or Spinner.",
            advancement = "Basic",
            recency = "Oldest"
        ),
        AdapterItem(
            name = "02.BaseAdapter",
            packageName = "android.widget.BaseAdapter",
            releaseDate = "October 2008 (Android 1.0)",
            description = "An abstract class for creating custom adapters, offering a foundation for displaying custom views in ListView, GridView, and Spinner.",
            advancement = "Intermediate",
            recency = "Old"
        ),
        AdapterItem(
            name = "03.SimpleAdapter",
            packageName = "android.widget.SimpleAdapter",
            releaseDate = "October 2008 (Android 1.0)",
            description = "Designed for displaying static data stored in Maps, mapping data to UI components within a layout, suitable for straightforward data structures in ListView and GridView.",
            advancement = "Intermediate",
            recency = "Old"
        ),
        AdapterItem(
            name = "04.CursorAdapter",
            packageName = "android.widget.CursorAdapter",
            releaseDate = "October 2008 (Android 1.0)",
            description = "Optimized for handling data retrieved from a cursor, such as SQLite database queries, for ListView and GridView.",
            advancement = "Intermediate",
            recency = "Relevant for database applications"
        ),
        AdapterItem(
            name = "05.SpinnerAdapter",
            packageName = "android.widget.SpinnerAdapter",
            releaseDate = "October 2008  (Android 1.0)",
            description = "An interface for binding Spinner views to their data, often used in conjunction with ArrayAdapter or custom implementations.",
            advancement = "Basic to Intermediate",
            recency = "Old but relevant for Spinner implementations"
        ),
        AdapterItem(
            name = "06.ExpandableListAdapter",
            packageName = "android.widget.ExpandableListAdapter",
            releaseDate = "October 2008  (Android 1.0)",
            description = "Used with ExpandableListView for displaying items in a two-level expandable list, ideal for hierarchical data presentation.",
            advancement = "Intermediate",
            recency = "Older, but unique for hierarchical data"
        ),
        AdapterItem(
            name = "07.PagerAdapter",
            packageName = "androidx.viewpager.widget.PagerAdapter",
            releaseDate = "May 2011 (Android 3.0, Honeycomb, with later updates in AndroidX)",
            description = "Manages views in ViewPager for implementing swipe able pages, forming a base for custom pager adapters.",
            advancement = "Intermediate",
            recency = "Superseded by ViewPager2 but still relevant"
        ),
        AdapterItem(
            name = "08.FragmentStatePagerAdapter",
            packageName = "androidx.fragment.app.FragmentStatePagerAdapter",
            releaseDate = "May 2011 (Android 3.0, Honeycomb, with later updates in AndroidX)",
            description = "Optimized for dynamic fragment collections in ViewPager, managing memory efficiently by destroying fragments not in view.",
            advancement = "Intermediate",
            recency = "Modern, replaced by ViewPager2 for new implementations"
        ),
        AdapterItem(
            name = "09.FragmentPagerAdapter",
            packageName = "androidx.fragment.app.FragmentPagerAdapter",
            releaseDate = "May 2011 (Android 3.0, Honeycomb, with later updates in AndroidX)",
            description = "Maintains fragments in memory, suited for a small, fixed number of pages in ViewPager.",
            advancement = "Intermediate",
            recency = "Modern, replaced by ViewPager2 for new implementations"
        ),
        AdapterItem(
            name = "10.RecyclerView.Adapter",
            packageName = "androidx.recyclerview.widget.RecyclerView.Adapter",
            releaseDate = "October 2014 (Android 5.0, Lollipop, with the introduction of AndroidX/Support Library)",
            description = "A flexible and efficient adapter for RecyclerView, supporting custom ViewHolder implementations, suitable for complex and dynamic lists.",
            advancement = "Advanced",
            recency = "Modern"
        ),
        AdapterItem(
            name = "11.ListAdapter",
            packageName = "androidx.recyclerview.widget.ListAdapter",
            releaseDate = "2018 (with the introduction of AndroidX)",
            description = "An extension of RecyclerView.Adapter with built-in DiffUtil support for efficient data updates and animations.",
            advancement = "Advanced",
            recency = "Modern"
        )
    )
}


