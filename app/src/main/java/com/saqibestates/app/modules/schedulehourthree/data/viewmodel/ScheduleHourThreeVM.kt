package com.saqibestates.app.modules.schedulehourthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulehourthree.`data`.model.ScheduleHourThreeModel
import org.koin.core.KoinComponent

class ScheduleHourThreeVM : ViewModel(), KoinComponent {
  val scheduleHourThreeModel: MutableLiveData<ScheduleHourThreeModel> =
      MutableLiveData(ScheduleHourThreeModel())

  var navArguments: Bundle? = null
}
