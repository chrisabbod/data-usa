package com.chrisabbod.data_usa.state_statistics

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
        holder.stateName.text = data[position].stateName
        holder.stateStatistic.text = data[position].statePopulation.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}