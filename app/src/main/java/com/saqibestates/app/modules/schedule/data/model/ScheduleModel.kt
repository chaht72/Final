package com.saqibestates.app.modules.schedule.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWallrepair: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_repair)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescribeyourp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_describe_your_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_ex_i_have_wat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAttachphotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_attach_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeavailablew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_available_w)

)
