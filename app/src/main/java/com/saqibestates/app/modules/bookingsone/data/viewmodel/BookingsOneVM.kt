package com.saqibestates.app.modules.bookingsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.bookingsone.`data`.model.BookingsOneModel
import org.koin.core.KoinComponent

class BookingsOneVM : ViewModel(), KoinComponent {
  val bookingsOneModel: MutableLiveData<BookingsOneModel> = MutableLiveData(BookingsOneModel())

  var navArguments: Bundle? = null
}
