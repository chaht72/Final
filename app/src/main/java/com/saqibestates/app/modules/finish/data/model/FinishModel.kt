package com.saqibestates.app.modules.finish.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class FinishModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFinish: String? = MyApp.getInstance().resources.getString(R.string.lbl_finish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_your_handyman_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveLukasara: String? =
      MyApp.getInstance().resources.getString(R.string.msg_give_lukas_a_ra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
