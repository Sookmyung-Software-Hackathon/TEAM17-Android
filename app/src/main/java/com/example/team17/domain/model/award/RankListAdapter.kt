package com.example.team17.domain.model.award

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.team17.R
import com.example.team17.databinding.ItemRankBinding
import org.koin.core.parameter.parametersOf

class RankListAdapter(
    private val data: List<RankListInfo>
) : ListAdapter<RankListInfo, RankListAdapter.RankListViewHolder>(
    diffUtil
) {

    class RankListViewHolder(
        val binding: ItemRankBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: RankListInfo, position: Int) {
            binding.data = data
            binding.tvSequence.text = (position + 1).toString()
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<RankListInfo>() {
            override fun areContentsTheSame(oldItem: RankListInfo, newItem: RankListInfo) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: RankListInfo, newItem: RankListInfo) =
                oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankListViewHolder {
        val binding: ItemRankBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_rank, parent, false
        )
        return RankListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RankListViewHolder, position: Int) {
        holder.onBind(data[position], position)
    }
}