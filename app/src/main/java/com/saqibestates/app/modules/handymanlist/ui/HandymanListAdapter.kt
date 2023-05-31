package com.saqibestates.app.modules.handymanlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowHandymanListBinding
import com.saqibestates.app.modules.handymanlist.`data`.model.HandymanListRowModel
import kotlin.Int
import kotlin.collections.List

class HandymanListAdapter(
  var list: List<HandymanListRowModel>
) : RecyclerView.Adapter<HandymanListAdapter.RowHandymanListVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHandymanListVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_handyman_list,parent,false)
    return RowHandymanListVH(view)
  }

  override fun onBindViewHolder(holder: RowHandymanListVH, position: Int) {
    val handymanListRowModel = HandymanListRowModel()
    // TODO uncomment following line after integration with data source
    // val handymanListRowModel = list[position]
    holder.binding.handymanListRowModel = handymanListRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HandymanListRowModel>) {
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
      item: HandymanListRowModel
    ) {
    }
  }

  inner class RowHandymanListVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHandymanListBinding = RowHandymanListBinding.bind(itemView)
    init {
      binding.txtDetails.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HandymanListRowModel())
      }
      binding.btnBook.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HandymanListRowModel())
      }
    }
  }
}
