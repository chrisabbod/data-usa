package com.chrisabbod.data_usa.historical_statistics

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chrisabbod.data_usa.R

class HistoricalStatisticsFragment : Fragment() {

    companion object {
        fun newInstance() = HistoricalStatisticsFragment()
    }

    private lateinit var viewModel: HistoricalStatisticsFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_historical_statistics, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HistoricalStatisticsFragmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}