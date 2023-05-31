package com.saqibestates.app.modules.chatshandyman.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsHandymanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThomasLukas: String? = MyApp.getInstance().resources.getString(R.string.lbl_thomas_lukas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_wall_with_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhenshallwes: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_minnie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_it_will_probabl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRightawayAre: String? = MyApp.getInstance().resources.getString(R.string.msg_yes_it_is_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIwouldloveto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_this_case_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.msg_see_you_on_frid)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null
)
