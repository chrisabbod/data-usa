package com.chrisabbod.data_usa.state_statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.chrisabbod.data_usa.databinding.FragmentStateStatisticsBinding

class StateStatisticsFragment : Fragment() {

    private lateinit var binding: FragmentStateStatisticsBinding

    private val stateDataList: List<StateData> = listOf(
        StateData("Alabama", 1234567),
        StateData("Arkansas", 1234567),
        StateData("Illinois", 1234567),
        StateData("Michigan", 1234567),
        StateData("Tennessee", 1234567),
        StateData("Texas", 1234567),
        StateData("Florida", 1234567),
        StateData("Ohio", 1234567),
        StateData("Washington", 1234567),
        StateData("California", 1234567),
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStateStatisticsBinding.inflate(inflater, container, false)

        binding.rvStateStatistics.layoutManager = LinearLayoutManager(activity)
        binding.rvStateStatistics.adapter = StateStatisticsAdapter(stateDataList)

        return binding.root
    }

}