package com.saqibestates.app.modules.schedulecalendartwo.ui

import android.view.View
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.appcomponents.views.DatePickerFragment
import com.saqibestates.app.appcomponents.views.TimePickerFragment
import com.saqibestates.app.databinding.ActivitySchedulecalendartwoBinding
import com.saqibestates.app.modules.schedulecalendartwo.`data`.model.ListabcRowModel
import com.saqibestates.app.modules.schedulecalendartwo.`data`.model.SpinnerZipcodeModel
import com.saqibestates.app.modules.schedulecalendartwo.`data`.viewmodel.SchedulecalendartwoVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SchedulecalendartwoActivity :
    BaseActivity<ActivitySchedulecalendartwoBinding>(R.layout.activity_schedulecalendartwo) {
  private val viewModel: SchedulecalendartwoVM by viewModels<SchedulecalendartwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerZipcodeList.value = mutableListOf(
    SpinnerZipcodeModel("Item1"),
    SpinnerZipcodeModel("Item2"),
    SpinnerZipcodeModel("Item3"),
    SpinnerZipcodeModel("Item4"),
    SpinnerZipcodeModel("Item5")
    )
    val spinnerZipcodeAdapter =
    SpinnerZipcodeAdapter(this,R.layout.spinner_item,viewModel.spinnerZipcodeList.value?:
    mutableListOf())
    binding.spinnerZipcode.adapter = spinnerZipcodeAdapter
    val listabcAdapter = ListabcAdapter(viewModel.listabcList.value?:mutableListOf())
    binding.recyclerListabc.adapter = listabcAdapter
    listabcAdapter.setOnItemClickListener(
    object : ListabcAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListabcRowModel) {
        onClickRecyclerListabc(view, position, item)
      }
    }
    )
    viewModel.listabcList.observe(this) {
      listabcAdapter.updateData(it)
    }
    binding.schedulecalendartwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowdateOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateOne(selectedDate)
      }
    }
    binding.linearRowtimeOne.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowtimeOne(selectedTime)
      }
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListabc(
    view: View,
    position: Int,
    item: ListabcRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULECALENDARTWO_ACTIVITY"

  }
}
