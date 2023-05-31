package com.saqibestates.app.modules.handymanlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.handymanlogin.`data`.model.HandymanLogInModel
import org.koin.core.KoinComponent

class HandymanLogInVM : ViewModel(), KoinComponent {
  val handymanLogInModel: MutableLiveData<HandymanLogInModel> =
      MutableLiveData(HandymanLogInModel())

  var navArguments: Bundle? = null
}
