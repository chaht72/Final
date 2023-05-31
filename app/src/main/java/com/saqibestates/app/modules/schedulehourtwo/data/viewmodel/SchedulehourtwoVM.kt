package com.saqibestates.app.modules.schedulehourtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulehourtwo.`data`.model.SchedulehourtwoModel
import org.koin.core.KoinComponent

class SchedulehourtwoVM : ViewModel(), KoinComponent {
  val schedulehourtwoModel: MutableLiveData<SchedulehourtwoModel> =
      MutableLiveData(SchedulehourtwoModel())

  var navArguments: Bundle? = null
}
