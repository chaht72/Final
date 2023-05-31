package com.saqibestates.app.modules.finishone.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class FinishOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFinish: String? = MyApp.getInstance().resources.getString(R.string.lbl_finish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCongrats: String? = MyApp.getInstance().resources.getString(R.string.lbl_congrats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_you_worked_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_your_total_earn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveThomasar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_give_thomas_a_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
