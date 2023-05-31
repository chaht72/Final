package com.saqibestates.app.modules.schedulehourtwo.ui

import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivityScheduleHourTwoBinding
import com.saqibestates.app.modules.schedulehourthree.ui.ScheduleHourThreeActivity
import com.saqibestates.app.modules.schedulehourtwo.`data`.viewmodel.ScheduleHourTwoVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class ScheduleHourTwoActivity :
    BaseActivity<ActivityScheduleHourTwoBinding>(R.layout.activity_schedule_hour_two) {
  private val viewModel: ScheduleHourTwoVM by viewModels<ScheduleHourTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scheduleHourTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
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
    binding.linearRowdateOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateOne(selectedDate)
      }
    }
    binding.linearCheckbox.setOnClickListener {
      val destIntent = ScheduleHourThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULE_HOUR_TWO_ACTIVITY"

  }
}
