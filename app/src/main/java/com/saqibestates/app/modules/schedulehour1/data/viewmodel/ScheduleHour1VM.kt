package com.saqibestates.app.modules.schedulehour1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulehour1.`data`.model.ScheduleHour1Model
import org.koin.core.KoinComponent

class ScheduleHour1VM : ViewModel(), KoinComponent {
  val scheduleHour1Model: MutableLiveData<ScheduleHour1Model> =
      MutableLiveData(ScheduleHour1Model())

  var navArguments: Bundle? = null
}
