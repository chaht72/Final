package com.saqibestates.app.modules.chatsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowChatsOneBinding
import com.saqibestates.app.modules.chatsone.`data`.model.ChatsOneRowModel
import kotlin.Int
import kotlin.collections.List

class ChatsOneAdapter(
  var list: List<ChatsOneRowModel>
) : RecyclerView.Adapter<ChatsOneAdapter.RowChatsOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChatsOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chats_one,parent,false)
    return RowChatsOneVH(view)
  }

  override fun onBindViewHolder(holder: RowChatsOneVH, position: Int) {
    val chatsOneRowModel = ChatsOneRowModel()
    // TODO uncomment following line after integration with data source
    // val chatsOneRowModel = list[position]
    holder.binding.chatsOneRowModel = chatsOneRowModel
  }

  override fun getItemCount(): Int = 11
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChatsOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ChatsOneRowModel
    ) {
    }
  }

  inner class RowChatsOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChatsOneBinding = RowChatsOneBinding.bind(itemView)
  }
}
