package com.saqibestates.app.modules.chats.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.chats.`data`.model.ChatsModel
import com.saqibestates.app.modules.chats.`data`.model.ChatsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChatsVM : ViewModel(), KoinComponent {
  val chatsModel: MutableLiveData<ChatsModel> = MutableLiveData(ChatsModel())

  var navArguments: Bundle? = null

  val chatsList: MutableLiveData<MutableList<ChatsRowModel>> = MutableLiveData(mutableListOf())
}
