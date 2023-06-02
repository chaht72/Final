package com.saqibestates.app.modules.cancelfinishworking.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class CancelFinishWorkingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOnGoing: String? = MyApp.getInstance().resources.getString(R.string.lbl_on_going)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCloseButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
