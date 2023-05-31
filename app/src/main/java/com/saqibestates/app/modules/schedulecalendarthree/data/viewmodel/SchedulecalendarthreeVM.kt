package com.saqibestates.app.modules.schedulecalendarthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulecalendarthree.`data`.model.SchedulecalendarthreeModel
import com.saqibestates.app.modules.schedulecalendarthree.`data`.model.SpinnerDecemberCounterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SchedulecalendarthreeVM : ViewModel(), KoinComponent {
  val schedulecalendarthreeModel: MutableLiveData<SchedulecalendarthreeModel> =
      MutableLiveData(SchedulecalendarthreeModel())

  var navArguments: Bundle? = null

  val spinnerDecemberCounterList: MutableLiveData<MutableList<SpinnerDecemberCounterModel>> =
      MutableLiveData()
}
