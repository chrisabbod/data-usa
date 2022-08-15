package com.chrisabbod.data_usa.state_statistics

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chrisabbod.data_usa.databinding.ItemStateStatisticsBinding

class StateStatisticsAdapter(private val data: List<StateData>) :
    RecyclerView.Adapter<StateStatisticsAdapter.StateStatisticsViewHolder>() {

    inner class StateStatisticsViewHolder(itemBinding: ItemStateStatisticsBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        val stateName = itemBinding.tvStateName
        val stateStatistic = itemBinding.tvStateStatistic
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateStatisticsViewHolder {
        return StateStatisticsViewHolder(
            ItemStateStatisticsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: StateStatisticsViewHolder, position: Int) {
        if (position < data.size && position >= 0) {
            val item = data[position]

            holder.stateName.text = item.stateName
            holder.stateStatistic.text = item.statePopulation.toString()
        } else {
            Log.e(
                "onBindViewHolder",
                "Item out of bounds. Position ($position). Array size (${data.size})"
            )
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}