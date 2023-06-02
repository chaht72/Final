package com.saqibestates.app.modules.finishone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.finishone.`data`.model.FinishOneModel
import org.koin.core.KoinComponent

class FinishOneVM : ViewModel(), KoinComponent {
  val finishOneModel: MutableLiveData<FinishOneModel> = MutableLiveData(FinishOneModel())

  var navArguments: Bundle? = null
}
