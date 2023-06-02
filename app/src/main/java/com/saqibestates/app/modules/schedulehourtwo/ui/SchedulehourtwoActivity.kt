package com.saqibestates.app.modules.schedulehourtwo.ui

import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivitySchedulehourtwoBinding
import com.saqibestates.app.modules.schedulehourthree.ui.SchedulehourthreeActivity
import com.saqibestates.app.modules.schedulehourtwo.`data`.viewmodel.SchedulehourtwoVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class SchedulehourtwoActivity :
    BaseActivity<ActivitySchedulehourtwoBinding>(R.layout.activity_schedulehourtwo) {
  private val viewModel: SchedulehourtwoVM by viewModels<SchedulehourtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.schedulehourtwoVM = viewModel
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
      val destIntent = SchedulehourthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULEHOURTWO_ACTIVITY"

  }
}
