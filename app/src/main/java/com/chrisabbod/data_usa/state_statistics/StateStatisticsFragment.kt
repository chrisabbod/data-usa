package com.chrisabbod.data_usa.state_statistics

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chrisabbod.data_usa.R

class StateStatisticsFragment : Fragment() {

    companion object {
        fun newInstance() = StateStatisticsFragment()
    }

    private lateinit var viewModel: StateStatisticsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_state_statistics, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StateStatisticsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}