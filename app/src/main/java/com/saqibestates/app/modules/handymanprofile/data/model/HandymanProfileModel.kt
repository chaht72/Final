package com.saqibestates.app.modules.handymanprofile.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class HandymanProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThomasLukas: String? = MyApp.getInstance().resources.getString(R.string.lbl_thomas_lukas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_thomaslukas_ema)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPublicprofile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_public_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProjectphotos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_project_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsandPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_settings_and_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
