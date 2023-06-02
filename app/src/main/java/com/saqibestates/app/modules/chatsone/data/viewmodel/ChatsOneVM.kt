package com.saqibestates.app.modules.chatsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.chatsone.`data`.model.ChatsOneModel
import com.saqibestates.app.modules.chatsone.`data`.model.ChatsOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChatsOneVM : ViewModel(), KoinComponent {
  val chatsOneModel: MutableLiveData<ChatsOneModel> = MutableLiveData(ChatsOneModel())

  var navArguments: Bundle? = null

  val chatsOneList: MutableLiveData<MutableList<ChatsOneRowModel>> =
      MutableLiveData(mutableListOf())
}
