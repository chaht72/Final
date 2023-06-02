package com.saqibestates.app.modules.schedule.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class DatetimeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDdmmyy: String? = MyApp.getInstance().resources.getString(R.string.lbl_dd_mm_yy)

)
