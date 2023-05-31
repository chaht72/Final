package com.saqibestates.app.modules.schedulecalendarthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulecalendarthree.`data`.model.ScheduleCalendarThreeModel
import com.saqibestates.app.modules.schedulecalendarthree.`data`.model.SpinnerDecemberCounterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScheduleCalendarThreeVM : ViewModel(), KoinComponent {
  val scheduleCalendarThreeModel: MutableLiveData<ScheduleCalendarThreeModel> =
      MutableLiveData(ScheduleCalendarThreeModel())

  var navArguments: Bundle? = null

  val spinnerDecemberCounterList: MutableLiveData<MutableList<SpinnerDecemberCounterModel>> =
      MutableLiveData()
}
