package com.chrisabbod.data_usa.state_statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chrisabbod.data_usa.databinding.FragmentStateStatisticsBinding

class StateStatisticsFragment : Fragment() {

    private lateinit var binding: FragmentStateStatisticsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStateStatisticsBinding.inflate(inflater, container, false)
        
        return binding.root
    }
    
}