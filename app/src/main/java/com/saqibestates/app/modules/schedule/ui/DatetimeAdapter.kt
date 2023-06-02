package com.saqibestates.app.modules.schedule.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowDatetimeBinding
import com.saqibestates.app.modules.schedule.`data`.model.DatetimeRowModel
import kotlin.Int
import kotlin.collections.List

class DatetimeAdapter(
  var list: List<DatetimeRowModel>
) : RecyclerView.Adapter<DatetimeAdapter.RowDatetimeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDatetimeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_datetime,parent,false)
    return RowDatetimeVH(view)
  }

  override fun onBindViewHolder(holder: RowDatetimeVH, position: Int) {
    val datetimeRowModel = DatetimeRowModel()
    // TODO uncomment following line after integration with data source
    // val datetimeRowModel = list[position]
    holder.binding.datetimeRowModel = datetimeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DatetimeRowModel>) {
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
      item: DatetimeRowModel
    ) {
    }
  }

  inner class RowDatetimeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDatetimeBinding = RowDatetimeBinding.bind(itemView)
    init {
      binding.linearColumndate.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DatetimeRowModel())
      }
    }
  }
}
