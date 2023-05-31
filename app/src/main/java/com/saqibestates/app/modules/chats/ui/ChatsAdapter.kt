package com.saqibestates.app.modules.chats.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowChatsBinding
import com.saqibestates.app.modules.chats.`data`.model.ChatsRowModel
import kotlin.Int
import kotlin.collections.List

class ChatsAdapter(
  var list: List<ChatsRowModel>
) : RecyclerView.Adapter<ChatsAdapter.RowChatsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChatsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chats,parent,false)
    return RowChatsVH(view)
  }

  override fun onBindViewHolder(holder: RowChatsVH, position: Int) {
    val chatsRowModel = ChatsRowModel()
    // TODO uncomment following line after integration with data source
    // val chatsRowModel = list[position]
    holder.binding.chatsRowModel = chatsRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChatsRowModel>) {
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
      item: ChatsRowModel
    ) {
    }
  }

  inner class RowChatsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChatsBinding = RowChatsBinding.bind(itemView)
  }
}
