package com.saqibestates.app.modules.schedulecalendarone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulecalendarone.`data`.model.ListmRowModel
import com.saqibestates.app.modules.schedulecalendarone.`data`.model.SchedulecalendaroneModel
import com.saqibestates.app.modules.schedulecalendarone.`data`.model.SpinnerDecemberCounterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SchedulecalendaroneVM : ViewModel(), KoinComponent {
  val schedulecalendaroneModel: MutableLiveData<SchedulecalendaroneModel> =
      MutableLiveData(SchedulecalendaroneModel())

  var navArguments: Bundle? = null

  val spinnerDecemberCounterList: MutableLiveData<MutableList<SpinnerDecemberCounterModel>> =
      MutableLiveData()

  val listmList: MutableLiveData<MutableList<ListmRowModel>> = MutableLiveData(mutableListOf())
}
