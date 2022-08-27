package com.example.team17.presentation.view.clipboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.team17.R
import com.example.team17.databinding.ItemBoggleListBinding
import com.example.team17.domain.model.home.MyBoggleInfo

class BoggleListAdapter(
    private val data: List<MyBoggleInfo>
) : ListAdapter<MyBoggleInfo, BoggleListAdapter.BoggleListViewHolder>(
    diffUtil
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoggleListViewHolder {
        val binding: ItemBoggleListBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_boggle_list, parent, false
        )
        return BoggleListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BoggleListViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    class BoggleListViewHolder(
        val binding: ItemBoggleListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: MyBoggleInfo) {
            binding.data = data
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<MyBoggleInfo>() {
            override fun areContentsTheSame(oldItem: MyBoggleInfo, newItem: MyBoggleInfo) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: MyBoggleInfo, newItem: MyBoggleInfo) =
                oldItem == newItem
        }
    }


}