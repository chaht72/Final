package com.saqibestates.app.modules.handymanlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.handymanlist.`data`.model.HandymanListRowModel
import com.saqibestates.app.modules.handymanlist.`data`.model.HandymanlistModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HandymanlistVM : ViewModel(), KoinComponent {
  val handymanlistModel: MutableLiveData<HandymanlistModel> = MutableLiveData(HandymanlistModel())

  var navArguments: Bundle? = null

  val handymanListList: MutableLiveData<MutableList<HandymanListRowModel>> =
      MutableLiveData(mutableListOf())
}
