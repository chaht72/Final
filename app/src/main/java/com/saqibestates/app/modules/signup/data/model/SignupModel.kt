package com.saqibestates.app.modules.signup.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltext: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_repeat_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentFourValue: String? = null
)
