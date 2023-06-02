package com.saqibestates.app.modules.handymanprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowListpriceBinding
import com.saqibestates.app.modules.handymanprofile.`data`.model.ListpriceRowModel
import kotlin.Int
import kotlin.collections.List

class ListpriceAdapter(
  var list: List<ListpriceRowModel>
) : RecyclerView.Adapter<ListpriceAdapter.RowListpriceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpriceVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprice,parent,false)
    return RowListpriceVH(view)
  }

  override fun onBindViewHolder(holder: RowListpriceVH, position: Int) {
    val listpriceRowModel = ListpriceRowModel()
    // TODO uncomment following line after integration with data source
    // val listpriceRowModel = list[position]
    holder.binding.listpriceRowModel = listpriceRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpriceRowModel>) {
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
      item: ListpriceRowModel
    ) {
    }
  }

  inner class RowListpriceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpriceBinding = RowListpriceBinding.bind(itemView)
  }
}
