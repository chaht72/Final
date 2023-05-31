package com.saqibestates.app.modules.handymanlist.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class HandymanListRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThomasLukas: String? = MyApp.getInstance().resources.getString(R.string.lbl_thomas_lukas2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallrepair: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_repair2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlumping: String? = MyApp.getInstance().resources.getString(R.string.lbl_plumping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallpainting: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_painting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWalldecoration: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wall_decoration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_hr)

)
