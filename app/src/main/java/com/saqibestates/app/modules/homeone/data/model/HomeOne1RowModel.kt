package com.saqibestates.app.modules.homeone.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class HomeOne1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_252)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_total_earning_t)

)
