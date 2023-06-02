package com.saqibestates.app.modules.landing.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.landing.`data`.model.LandingModel
import org.koin.core.KoinComponent

class LandingVM : ViewModel(), KoinComponent {
  val landingModel: MutableLiveData<LandingModel> = MutableLiveData(LandingModel())

  var navArguments: Bundle? = null
}
