package com.example.team17.presentation.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.team17.R
import com.example.team17.databinding.ItemHomeVoteBinding

class VoteListAdapter : ListAdapter<String, VoteListAdapter.VoteListViewHolder>(
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
        holder.onBind()
    }

    class VoteListViewHolder(
        val binding: ItemHomeVoteBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind() {

        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<String>() {
            override fun areContentsTheSame(oldItem: String, newItem: String) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: String, newItem: String) =
                oldItem == newItem
        }
    }


}