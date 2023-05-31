package com.saqibestates.app.modules.schedulehourtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulehourtwo.`data`.model.ScheduleHourTwoModel
import org.koin.core.KoinComponent

class ScheduleHourTwoVM : ViewModel(), KoinComponent {
  val scheduleHourTwoModel: MutableLiveData<ScheduleHourTwoModel> =
      MutableLiveData(ScheduleHourTwoModel())

  var navArguments: Bundle? = null
}
