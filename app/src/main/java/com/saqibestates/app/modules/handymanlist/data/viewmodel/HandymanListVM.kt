package com.saqibestates.app.modules.handymanlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.handymanlist.`data`.model.HandymanListModel
import com.saqibestates.app.modules.handymanlist.`data`.model.HandymanListRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HandymanListVM : ViewModel(), KoinComponent {
  val handymanListModel: MutableLiveData<HandymanListModel> = MutableLiveData(HandymanListModel())

  var navArguments: Bundle? = null

  val handymanListList: MutableLiveData<MutableList<HandymanListRowModel>> =
      MutableLiveData(mutableListOf())
}
