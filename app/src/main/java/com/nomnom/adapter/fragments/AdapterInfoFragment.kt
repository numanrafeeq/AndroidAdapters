package com.nomnom.adapter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.google.gson.Gson
import com.nomnom.adapter.R
import com.nomnom.adapter.base.BaseFragment
import com.nomnom.adapter.databinding.FragmentFirstBinding
import com.nomnom.adapter.model.AdapterItem

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class AdapterInfoFragment : BaseFragment<FragmentFirstBinding>(R.layout.fragment_first) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.getString(ARG_JSON_DATA)?.let { jsonData ->


            populateUIWithJson(jsonData)
        }
    }

    companion object {
        private const val ARG_JSON_DATA = "json_data"

        fun newInstance(jsonData: String): AdapterInfoFragment {
            val fragment = AdapterInfoFragment()
            val args = Bundle().apply {
                putString(ARG_JSON_DATA, jsonData)
            }
            fragment.arguments = args
            return fragment
        }
    }


    fun populateUIWithJson(jsonData: String) {
        val gson = Gson()
        val adapterItem = gson.fromJson(jsonData, AdapterItem::class.java)

        setData(adapterItem)

    }

    fun setData(adapterItem: AdapterItem) {

        binding.textViewName.text = adapterItem.name
        binding.textViewPackage.text = adapterItem.packageName
        binding.textViewReleaseDate.text = adapterItem.releaseDate
        binding.textViewDescription.text = adapterItem.description
        binding.textViewAdvancement.text = adapterItem.advancement
        binding.textViewRecency.text = adapterItem.recency

    }

}