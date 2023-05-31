package com.saqibestates.app.modules.bookingsone.ui

import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityBookingsOneBinding
import com.saqibestates.app.modules.bookingsone.`data`.viewmodel.BookingsOneVM
import com.saqibestates.app.modules.chatclient.ui.ChatClientActivity
import com.saqibestates.app.modules.finishone.ui.FinishOneActivity
import kotlin.String
import kotlin.Unit

class BookingsOneActivity : BaseActivity<ActivityBookingsOneBinding>(R.layout.activity_bookings_one)
    {
  private val viewModel: BookingsOneVM by viewModels<BookingsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etFrame362Two.setOnClickListener {
      val destIntent = ChatClientActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etFrame362.setOnClickListener {
      val destIntent = ChatClientActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etFrame362One.setOnClickListener {
      val destIntent = ChatClientActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFinish.setOnClickListener {
      val destIntent = FinishOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKINGS_ONE_ACTIVITY"

  }
}
