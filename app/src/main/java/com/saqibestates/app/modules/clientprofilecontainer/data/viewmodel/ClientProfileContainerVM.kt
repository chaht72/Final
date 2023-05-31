package com.saqibestates.app.modules.clientprofilecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.clientprofilecontainer.`data`.model.ClientProfileContainerModel
import org.koin.core.KoinComponent

class ClientProfileContainerVM : ViewModel(), KoinComponent {
  val clientProfileContainerModel: MutableLiveData<ClientProfileContainerModel> =
      MutableLiveData(ClientProfileContainerModel())

  var navArguments: Bundle? = null
}
