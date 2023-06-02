package com.saqibestates.app.modules.clientprofile.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class CardsstatisticRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.msg_total_invoice_c)

)
