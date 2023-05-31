package com.saqibestates.app.modules.schedulehourthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivitySchedulehourthreeBinding
import com.saqibestates.app.modules.handymanlist.ui.HandymanlistActivity
import com.saqibestates.app.modules.schedulehourthree.`data`.viewmodel.SchedulehourthreeVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class SchedulehourthreeActivity :
    BaseActivity<ActivitySchedulehourthreeBinding>(R.layout.activity_schedulehourthree) {
  private val viewModel: SchedulehourthreeVM by viewModels<SchedulehourthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.schedulehourthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAvalaibleworke.setOnClickListener {
      val destIntent = HandymanlistActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowdateOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateOne(selectedDate)
      }
    }
    binding.linearRowtimeOne.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowtimeOne(selectedTime)
      }
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULEHOURTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SchedulehourthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
