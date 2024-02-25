package com.nomnom.adapter.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.nomnom.adapter.R
import com.nomnom.adapter.base.BaseFragment
import com.nomnom.adapter.databinding.FragmentFirstBinding
import com.nomnom.adapter.model.AdapterItem

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SpinnerAdapterFragment : BaseFragment<FragmentFirstBinding>(R.layout.fragment_first) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        
    }

    companion object {
        private const val ARG_JSON_DATA = "json_data"

        fun newInstance(jsonData: String): ArrayAdapterFragment {
            val fragment = ArrayAdapterFragment()
            val args = Bundle().apply {
                putString(ARG_JSON_DATA, jsonData)
            }
            fragment.arguments = args
            return fragment
        }
    }

    

}