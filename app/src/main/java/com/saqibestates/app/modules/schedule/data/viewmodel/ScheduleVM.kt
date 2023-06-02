package com.saqibestates.app.modules.schedule.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedule.`data`.model.DatetimeRowModel
import com.saqibestates.app.modules.schedule.`data`.model.ScheduleModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScheduleVM : ViewModel(), KoinComponent {
  val scheduleModel: MutableLiveData<ScheduleModel> = MutableLiveData(ScheduleModel())

  var navArguments: Bundle? = null

  val datetimeList: MutableLiveData<MutableList<DatetimeRowModel>> =
      MutableLiveData(mutableListOf())
}
