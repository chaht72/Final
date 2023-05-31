package com.saqibestates.app.modules.homeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowHomeOneBinding
import com.saqibestates.app.modules.homeone.`data`.model.HomeOneRowModel
import kotlin.Int
import kotlin.collections.List

class HomeOneAdapter(
  var list: List<HomeOneRowModel>
) : RecyclerView.Adapter<HomeOneAdapter.RowHomeOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_one,parent,false)
    return RowHomeOneVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeOneVH, position: Int) {
    val homeOneRowModel = HomeOneRowModel()
    // TODO uncomment following line after integration with data source
    // val homeOneRowModel = list[position]
    holder.binding.homeOneRowModel = homeOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeOneRowModel>) {
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
      item: HomeOneRowModel
    ) {
    }
  }

  inner class RowHomeOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeOneBinding = RowHomeOneBinding.bind(itemView)
    init {
      binding.linearCard.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomeOneRowModel())
      }
    }
  }
}
