package com.saqibestates.app.modules.schedule.ui

import android.view.View
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityScheduleBinding
import com.saqibestates.app.modules.schedule.`data`.model.DatetimeRowModel
import com.saqibestates.app.modules.schedule.`data`.viewmodel.ScheduleVM
import com.saqibestates.app.modules.schedulecalendarone.ui.ScheduleCalendarOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleActivity : BaseActivity<ActivityScheduleBinding>(R.layout.activity_schedule) {
  private val viewModel: ScheduleVM by viewModels<ScheduleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val datetimeAdapter = DatetimeAdapter(viewModel.datetimeList.value?:mutableListOf())
    binding.recyclerDatetime.adapter = datetimeAdapter
    datetimeAdapter.setOnItemClickListener(
    object : DatetimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DatetimeRowModel) {
        onClickRecyclerDatetime(view, position, item)
      }
    }
    )
    viewModel.datetimeList.observe(this) {
      datetimeAdapter.updateData(it)
    }
    binding.scheduleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerDatetime(
    view: View,
    position: Int,
    item: DatetimeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumndate ->  {
        val destIntent = ScheduleCalendarOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_ACTIVITY"

  }
}
