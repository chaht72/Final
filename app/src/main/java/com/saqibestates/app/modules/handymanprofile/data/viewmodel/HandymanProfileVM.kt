package com.saqibestates.app.modules.handymanprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.handymanprofile.`data`.model.HandymanProfileModel
import com.saqibestates.app.modules.handymanprofile.`data`.model.ListpriceRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HandymanProfileVM : ViewModel(), KoinComponent {
  val handymanProfileModel: MutableLiveData<HandymanProfileModel> =
      MutableLiveData(HandymanProfileModel())

  var navArguments: Bundle? = null

  val listpriceList: MutableLiveData<MutableList<ListpriceRowModel>> =
      MutableLiveData(mutableListOf())
}
