package com.saqibestates.app.modules.schedulecalendarone.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class ListmRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtM: String? = MyApp.getInstance().resources.getString(R.string.lbl_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)

)
