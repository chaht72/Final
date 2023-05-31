package com.saqibestates.app.modules.schedulecalendartwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulecalendartwo.`data`.model.ListabcRowModel
import com.saqibestates.app.modules.schedulecalendartwo.`data`.model.SchedulecalendartwoModel
import com.saqibestates.app.modules.schedulecalendartwo.`data`.model.SpinnerZipcodeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SchedulecalendartwoVM : ViewModel(), KoinComponent {
  val schedulecalendartwoModel: MutableLiveData<SchedulecalendartwoModel> =
      MutableLiveData(SchedulecalendartwoModel())

  var navArguments: Bundle? = null

  val spinnerZipcodeList: MutableLiveData<MutableList<SpinnerZipcodeModel>> = MutableLiveData()

  val listabcList: MutableLiveData<MutableList<ListabcRowModel>> = MutableLiveData(mutableListOf())
}
