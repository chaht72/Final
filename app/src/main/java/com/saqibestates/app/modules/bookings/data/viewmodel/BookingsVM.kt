package com.saqibestates.app.modules.bookings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibestates.app.modules.bookings.`data`.model.BookingsModel
import org.koin.core.KoinComponent

class BookingsVM : ViewModel(), KoinComponent {
  val bookingsModel: MutableLiveData<BookingsModel> = MutableLiveData(BookingsModel())

  var navArguments: Bundle? = null
}
