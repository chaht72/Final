package com.saqibestates.app.modules.clientprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibestates.app.R
import com.saqibestates.app.databinding.RowCardsstatisticBinding
import com.saqibestates.app.modules.clientprofile.`data`.model.CardsstatisticRowModel
import kotlin.Int
import kotlin.collections.List

class CardsstatisticAdapter(
  var list: List<CardsstatisticRowModel>
) : RecyclerView.Adapter<CardsstatisticAdapter.RowCardsstatisticVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCardsstatisticVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cardsstatistic,parent,false)
    return RowCardsstatisticVH(view)
  }

  override fun onBindViewHolder(holder: RowCardsstatisticVH, position: Int) {
    val cardsstatisticRowModel = CardsstatisticRowModel()
    // TODO uncomment following line after integration with data source
    // val cardsstatisticRowModel = list[position]
    holder.binding.cardsstatisticRowModel = cardsstatisticRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CardsstatisticRowModel>) {
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
      item: CardsstatisticRowModel
    ) {
    }
  }

  inner class RowCardsstatisticVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCardsstatisticBinding = RowCardsstatisticBinding.bind(itemView)
  }
}
