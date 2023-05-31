package com.saqibestates.app.modules.ordersummary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.ordersummary.`data`.model.OrderSummaryModel
import org.koin.core.KoinComponent

class OrderSummaryVM : ViewModel(), KoinComponent {
  val orderSummaryModel: MutableLiveData<OrderSummaryModel> = MutableLiveData(OrderSummaryModel())

  var navArguments: Bundle? = null
}
