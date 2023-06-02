package com.saqibestates.app.modules.chatshandyman.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.chatshandyman.`data`.model.ChatsHandymanModel
import org.koin.core.KoinComponent

class ChatsHandymanVM : ViewModel(), KoinComponent {
  val chatsHandymanModel: MutableLiveData<ChatsHandymanModel> =
      MutableLiveData(ChatsHandymanModel())

  var navArguments: Bundle? = null
}
