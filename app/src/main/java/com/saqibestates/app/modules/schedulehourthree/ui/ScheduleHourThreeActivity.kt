package com.saqibestates.app.modules.schedulehourthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivityScheduleHourThreeBinding
import com.saqibestates.app.modules.handymanlist.ui.HandymanListActivity
import com.saqibestates.app.modules.schedulehourthree.`data`.viewmodel.ScheduleHourThreeVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class ScheduleHourThreeActivity :
    BaseActivity<ActivityScheduleHourThreeBinding>(R.layout.activity_schedule_hour_three) {
  private val viewModel: ScheduleHourThreeVM by viewModels<ScheduleHourThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scheduleHourThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAvalaibleworke.setOnClickListener {
      val destIntent = HandymanListActivity.getIntent(this, null)
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

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date): Unit {
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date): Unit {
  }

  companion object {
    const val TAG: String = "SCHEDULE_HOUR_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScheduleHourThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
