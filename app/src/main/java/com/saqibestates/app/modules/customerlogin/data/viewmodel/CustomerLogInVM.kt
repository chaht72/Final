package com.saqibestates.app.modules.customerlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.customerlogin.`data`.model.CustomerLogInModel
import org.koin.core.KoinComponent

class CustomerLogInVM : ViewModel(), KoinComponent {
  val customerLogInModel: MutableLiveData<CustomerLogInModel> =
      MutableLiveData(CustomerLogInModel())

  var navArguments: Bundle? = null
}
