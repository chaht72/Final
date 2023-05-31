package com.saqibestates.app.modules.ordersummary.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityOrderSummaryBinding
import com.saqibestates.app.modules.confirm.ui.ConfirmActivity
import com.saqibestates.app.modules.detailshandyman.ui.DetailsHandymanActivity
import com.saqibestates.app.modules.ordersummary.`data`.viewmodel.OrderSummaryVM
import kotlin.String
import kotlin.Unit

class OrderSummaryActivity :
    BaseActivity<ActivityOrderSummaryBinding>(R.layout.activity_order_summary) {
  private val viewModel: OrderSummaryVM by viewModels<OrderSummaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.orderSummaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearBookbutton.setOnClickListener {
      val destIntent = ConfirmActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowthomaslukas.setOnClickListener {
      val destIntent = DetailsHandymanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ORDER_SUMMARY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderSummaryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
