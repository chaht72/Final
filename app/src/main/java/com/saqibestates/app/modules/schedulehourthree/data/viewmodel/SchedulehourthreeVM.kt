package com.saqibestates.app.modules.schedulehourthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulehourthree.`data`.model.SchedulehourthreeModel
import org.koin.core.KoinComponent

class SchedulehourthreeVM : ViewModel(), KoinComponent {
  val schedulehourthreeModel: MutableLiveData<SchedulehourthreeModel> =
      MutableLiveData(SchedulehourthreeModel())

  var navArguments: Bundle? = null
}
