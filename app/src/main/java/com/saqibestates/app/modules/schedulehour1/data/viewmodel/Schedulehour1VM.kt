package com.saqibestates.app.modules.schedulehour1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.schedulehour1.`data`.model.Schedulehour1Model
import org.koin.core.KoinComponent

class Schedulehour1VM : ViewModel(), KoinComponent {
  val schedulehour1Model: MutableLiveData<Schedulehour1Model> =
      MutableLiveData(Schedulehour1Model())

  var navArguments: Bundle? = null
}
