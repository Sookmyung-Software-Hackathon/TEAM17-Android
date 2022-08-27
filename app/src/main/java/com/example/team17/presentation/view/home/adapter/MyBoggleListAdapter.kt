package com.example.team17.presentation.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.team17.R
import com.example.team17.databinding.ItemMyBoggleBinding
import com.example.team17.domain.model.home.MyBoggleInfo
import com.example.team17.presentation.view.home.adapter.MyBoggleListAdapter.*

class MyBoggleListAdapter : ListAdapter<String, MyBoggleListViewHolder>(
    diffUtil
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyBoggleListViewHolder {
        val binding: ItemMyBoggleBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_my_boggle, parent, false
        )
        return MyBoggleListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyBoggleListViewHolder, position: Int) {
        holder.onBind()
    }

    class MyBoggleListViewHolder(
        val binding: ItemMyBoggleBinding
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