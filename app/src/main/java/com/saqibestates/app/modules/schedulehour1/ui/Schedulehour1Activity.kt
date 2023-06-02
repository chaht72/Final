package com.saqibestates.app.modules.schedulehour1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivitySchedulehour1Binding
import com.saqibestates.app.modules.schedulehour1.`data`.viewmodel.Schedulehour1VM
import java.util.Date
import kotlin.String
import kotlin.Unit

class Schedulehour1Activity :
    BaseActivity<ActivitySchedulehour1Binding>(R.layout.activity_schedulehour1) {
  private val viewModel: Schedulehour1VM by viewModels<Schedulehour1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.schedulehour1VM = viewModel
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
    const val TAG: String = "SCHEDULEHOUR1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Schedulehour1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
