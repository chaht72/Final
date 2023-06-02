package com.saqibestates.app.modules.signupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.signupone.`data`.model.SignUpOneModel
import org.koin.core.KoinComponent

class SignUpOneVM : ViewModel(), KoinComponent {
  val signUpOneModel: MutableLiveData<SignUpOneModel> = MutableLiveData(SignUpOneModel())

  var navArguments: Bundle? = null
}
