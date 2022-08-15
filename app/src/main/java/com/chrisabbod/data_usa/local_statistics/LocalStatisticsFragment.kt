package com.chrisabbod.data_usa.local_statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.chrisabbod.data_usa.databinding.FragmentLocalStatisticsBinding
import com.chrisabbod.data_usa.model.CityData

class LocalStatisticsFragment : Fragment() {

    private lateinit var binding: FragmentLocalStatisticsBinding

    private var cityDataList = listOf(
        CityData("Macomb Township", 90758),
        CityData("Shelby Township", 93757),
        CityData("Sterling Heights", 35732),
        CityData("Clinton Township", 23435),
        CityData("Madison Heights", 54323),
        CityData("Warren", 22335),
        CityData("Detroit", 1423523),
        CityData("Mount Clemens", 23521),
        CityData("Royal Oak", 66432),
        CityData("Romeo Township", 73245),
        CityData("Washington Township", 23753),
        CityData("Rochester", 53275)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLocalStatisticsBinding.inflate(inflater, container, false)
        binding.rvLocalStatistics.layoutManager = LinearLayoutManager(activity)
        binding.rvLocalStatistics.adapter = LocalStatisticsAdapter(cityDataList)

        return binding.root
    }
}

