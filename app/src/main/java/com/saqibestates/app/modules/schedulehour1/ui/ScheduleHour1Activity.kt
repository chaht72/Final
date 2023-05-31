package com.saqibestates.app.modules.schedulehour1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivityScheduleHour1Binding
import com.saqibestates.app.modules.schedulehour1.`data`.viewmodel.ScheduleHour1VM
import java.util.Date
import kotlin.String
import kotlin.Unit

class ScheduleHour1Activity :
    BaseActivity<ActivityScheduleHour1Binding>(R.layout.activity_schedule_hour_1) {
  private val viewModel: ScheduleHour1VM by viewModels<ScheduleHour1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scheduleHour1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtimeOne.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
        selectedTime ->
        onTimeSelectedLinearRowtimeOne(selectedTime)
      }
    }
    binding.linearRowdateOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearRowdateOne(selectedDate)
      }
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date): Unit {
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date): Unit {
  }

  companion object {
    const val TAG: String = "SCHEDULE_HOUR1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScheduleHour1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
