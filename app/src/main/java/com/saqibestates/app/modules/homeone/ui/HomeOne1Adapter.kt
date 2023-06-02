package com.saqibestates.app.modules.homeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowHomeOne1Binding
import com.saqibestates.app.modules.homeone.`data`.model.HomeOne1RowModel
import kotlin.Int
import kotlin.collections.List

class HomeOne1Adapter(
  var list: List<HomeOne1RowModel>
) : RecyclerView.Adapter<HomeOne1Adapter.RowHomeOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeOne1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_one1,parent,false)
    return RowHomeOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowHomeOne1VH, position: Int) {
    val homeOne1RowModel = HomeOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val homeOne1RowModel = list[position]
    holder.binding.homeOne1RowModel = homeOne1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeOne1RowModel>) {
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
      item: HomeOne1RowModel
    ) {
    }
  }

  inner class RowHomeOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeOne1Binding = RowHomeOne1Binding.bind(itemView)
  }
}
