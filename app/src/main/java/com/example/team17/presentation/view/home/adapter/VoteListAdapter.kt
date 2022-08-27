package com.example.team17.presentation.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.team17.R
import com.example.team17.databinding.ItemHomeVoteBinding
import com.example.team17.domain.model.home.VoteBoggleInfo

class VoteListAdapter(
    private val data: List<VoteBoggleInfo>
) : ListAdapter<VoteBoggleInfo, VoteListAdapter.VoteListViewHolder>(
    diffUtil
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoteListViewHolder {
        val binding: ItemHomeVoteBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_home_vote, parent, false
        )
        return VoteListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VoteListViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    class VoteListViewHolder(
        val binding: ItemHomeVoteBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: VoteBoggleInfo) {
            binding.data = data
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<VoteBoggleInfo>() {
            override fun areContentsTheSame(oldItem: VoteBoggleInfo, newItem: VoteBoggleInfo) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: VoteBoggleInfo, newItem: VoteBoggleInfo) =
                oldItem == newItem
        }
    }


}