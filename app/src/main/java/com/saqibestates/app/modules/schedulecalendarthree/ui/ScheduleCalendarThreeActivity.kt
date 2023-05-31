package com.saqibestates.app.modules.schedulecalendarthree.ui

import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivityScheduleCalendarThreeBinding
import com.saqibestates.app.modules.schedulecalendarthree.`data`.model.SpinnerDecemberCounterModel
import com.saqibestates.app.modules.schedulecalendarthree.`data`.viewmodel.ScheduleCalendarThreeVM
import com.saqibestates.app.modules.schedulehour1.ui.ScheduleHour1Activity
import java.util.Date
import kotlin.String
import kotlin.Unit

class ScheduleCalendarThreeActivity :
    BaseActivity<ActivityScheduleCalendarThreeBinding>(R.layout.activity_schedule_calendar_three) {
  private val viewModel: ScheduleCalendarThreeVM by viewModels<ScheduleCalendarThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerDecemberCounterList.value = mutableListOf(
    SpinnerDecemberCounterModel("Item1"),
    SpinnerDecemberCounterModel("Item2"),
    SpinnerDecemberCounterModel("Item3"),
    SpinnerDecemberCounterModel("Item4"),
    SpinnerDecemberCounterModel("Item5")
    )
    val spinnerDecemberCounterAdapter =
    SpinnerDecemberCounterAdapter(this,R.layout.spinner_item,viewModel.spinnerDecemberCounterList.value?:
    mutableListOf())
    binding.spinnerDecemberCounter.adapter = spinnerDecemberCounterAdapter
    binding.scheduleCalendarThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtimeOne.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowtimeOne(selectedTime)
      }
    }
    binding.btn2022.setOnClickListener {
      val destIntent = ScheduleHour1Activity.getIntent(this, null)
      startActivity(destIntent)
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
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULE_CALENDAR_THREE_ACTIVITY"

  }
}
