package com.chrisabbod.data_usa.local_statistics

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chrisabbod.data_usa.databinding.ItemLocalStatisticsBinding
import com.chrisabbod.data_usa.model.CityData

class LocalStatisticsAdapter(private val data: List<CityData>) :
    RecyclerView.Adapter<LocalStatisticsAdapter.LocalStatisticsViewHolder>() {

    inner class LocalStatisticsViewHolder(itemBinding: ItemLocalStatisticsBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        val localName = itemBinding.tvCityName
        val localStatistic = itemBinding.tvCityStatistic
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocalStatisticsViewHolder {
        return LocalStatisticsViewHolder(
            ItemLocalStatisticsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: LocalStatisticsViewHolder, position: Int) {
        if (position < data.size && position >= 0) {
            val item = data[position]

            holder.localName.text = item.cityName
            holder.localStatistic.text = item.cityPopulation.toString()
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