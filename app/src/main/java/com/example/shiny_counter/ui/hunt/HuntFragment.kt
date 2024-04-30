package com.example.shiny_counter.ui.hunt

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shiny_counter.R

class HuntFragment : Fragment() {

    companion object {
        fun newInstance() = HuntFragment()
    }

    private lateinit var viewModel: HuntViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hunt, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HuntViewModel::class.java)
        // TODO: Use the ViewModel
    }

}