package com.saqibestates.app.modules.detailshandyman.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.detailshandyman.`data`.model.DetailsHandymanModel
import org.koin.core.KoinComponent

class DetailsHandymanVM : ViewModel(), KoinComponent {
  val detailsHandymanModel: MutableLiveData<DetailsHandymanModel> =
      MutableLiveData(DetailsHandymanModel())

  var navArguments: Bundle? = null
}
