package com.saqibestates.app.modules.chatclient.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.chatclient.`data`.model.ChatClientModel
import org.koin.core.KoinComponent

class ChatClientVM : ViewModel(), KoinComponent {
  val chatClientModel: MutableLiveData<ChatClientModel> = MutableLiveData(ChatClientModel())

  var navArguments: Bundle? = null
}
