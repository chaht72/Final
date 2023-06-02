package com.saqibestates.app.modules.landing.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class LandingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_your_acc)

)
