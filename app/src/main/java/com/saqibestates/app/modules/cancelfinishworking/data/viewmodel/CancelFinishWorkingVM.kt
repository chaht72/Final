package com.saqibestates.app.modules.cancelfinishworking.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.cancelfinishworking.`data`.model.CancelFinishWorkingModel
import org.koin.core.KoinComponent

class CancelFinishWorkingVM : ViewModel(), KoinComponent {
  val cancelFinishWorkingModel: MutableLiveData<CancelFinishWorkingModel> =
      MutableLiveData(CancelFinishWorkingModel())

  var navArguments: Bundle? = null
}
