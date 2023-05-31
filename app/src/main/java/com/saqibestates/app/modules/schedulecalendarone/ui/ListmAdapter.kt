package com.saqibestates.app.modules.schedulecalendarone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowListmBinding
import com.saqibestates.app.modules.schedulecalendarone.`data`.model.ListmRowModel
import kotlin.Int
import kotlin.collections.List

class ListmAdapter(
  var list: List<ListmRowModel>
) : RecyclerView.Adapter<ListmAdapter.RowListmVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listm,parent,false)
    return RowListmVH(view)
  }

  override fun onBindViewHolder(holder: RowListmVH, position: Int) {
    val listmRowModel = ListmRowModel()
    // TODO uncomment following line after integration with data source
    // val listmRowModel = list[position]
    holder.binding.listmRowModel = listmRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmRowModel>) {
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
      item: ListmRowModel
    ) {
    }
  }

  inner class RowListmVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmBinding = RowListmBinding.bind(itemView)
  }
}
