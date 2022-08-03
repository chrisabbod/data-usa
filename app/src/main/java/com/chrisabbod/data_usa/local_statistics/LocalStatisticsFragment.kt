package com.chrisabbod.data_usa.local_statistics

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chrisabbod.data_usa.R

class LocalStatisticsFragment : Fragment() {

    companion object {
        fun newInstance() = LocalStatisticsFragment()
    }

    private lateinit var viewModel: LocalStatisticsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_local_statistics, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LocalStatisticsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}