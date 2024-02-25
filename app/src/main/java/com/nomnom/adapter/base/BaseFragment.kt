package com.nomnom.adapter.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.nomnom.adapter.model.AdapterItem


@Suppress("PropertyName")
abstract class BaseFragment<BindingType : ViewDataBinding>(@LayoutRes private val layout: Int) :
    Fragment() {

    val TAG = "XYZ"

    lateinit var binding: BindingType


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, layout, container, false)
        return binding.root
    }





}