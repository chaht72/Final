package com.saqibestates.app.modules.schedulecalendartwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowListabcBinding
import com.saqibestates.app.modules.schedulecalendartwo.`data`.model.ListabcRowModel
import kotlin.Int
import kotlin.collections.List

class ListabcAdapter(
  var list: List<ListabcRowModel>
) : RecyclerView.Adapter<ListabcAdapter.RowListabcVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListabcVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listabc,parent,false)
    return RowListabcVH(view)
  }

  override fun onBindViewHolder(holder: RowListabcVH, position: Int) {
    val listabcRowModel = ListabcRowModel()
    // TODO uncomment following line after integration with data source
    // val listabcRowModel = list[position]
    holder.binding.listabcRowModel = listabcRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListabcRowModel>) {
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
      item: ListabcRowModel
    ) {
    }
  }

  inner class RowListabcVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListabcBinding = RowListabcBinding.bind(itemView)
  }
}
