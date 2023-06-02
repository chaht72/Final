package com.saqibestates.app.modules.home.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinnie: String? = MyApp.getInstance().resources.getString(R.string.lbl_minnie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCatagories: String? = MyApp.getInstance().resources.getString(R.string.msg_search_your_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFieldtext: String? = MyApp.getInstance().resources.getString(R.string.msg_what_services_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)

)
