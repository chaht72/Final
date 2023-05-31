package com.saqibestates.app.modules.ordersummary.`data`.model

import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.di.MyApp
import kotlin.String

data class OrderSummaryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrdersummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallrepair: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_repair)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeaksintheba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_leaks_in_the_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_21_2022_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_hr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandyman: String? = MyApp.getInstance().resources.getString(R.string.lbl_handyman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThomasLukas: String? = MyApp.getInstance().resources.getString(R.string.lbl_thomas_lukas2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt38ChestnutStr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_38_chestnut_str)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentdetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVisaDebitcard: String? =
      MyApp.getInstance().resources.getString(R.string.msg_visa_debit_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_your_payment_wi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame335Value: String? = null
)
