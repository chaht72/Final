package com.saqibestates.app.modules.homeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityHomeOneBinding
import com.saqibestates.app.modules.cancelfinishworking.ui.CancelFinishWorkingActivity
import com.saqibestates.app.modules.handymanprofile.ui.HandymanProfileActivity
import com.saqibestates.app.modules.homeone.`data`.model.HomeOne1RowModel
import com.saqibestates.app.modules.homeone.`data`.model.HomeOneRowModel
import com.saqibestates.app.modules.homeone.`data`.viewmodel.HomeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeOneActivity : BaseActivity<ActivityHomeOneBinding>(R.layout.activity_home_one) {
  private val viewModel: HomeOneVM by viewModels<HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeOneAdapter = HomeOneAdapter(viewModel.homeOneList.value?:mutableListOf())
    binding.recyclerHomeOne.adapter = homeOneAdapter
    homeOneAdapter.setOnItemClickListener(
    object : HomeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeOneRowModel) {
        onClickRecyclerHomeOne(view, position, item)
      }
    }
    )
    viewModel.homeOneList.observe(this) {
      homeOneAdapter.updateData(it)
    }
    val homeOne1Adapter = HomeOne1Adapter(viewModel.homeOne1List.value?:mutableListOf())
    binding.recyclerHomeOne1.adapter = homeOne1Adapter
    homeOne1Adapter.setOnItemClickListener(
    object : HomeOne1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeOne1RowModel) {
        onClickRecyclerHomeOne1(view, position, item)
      }
    }
    )
    viewModel.homeOne1List.observe(this) {
      homeOne1Adapter.updateData(it)
    }
    binding.homeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowwelcome.setOnClickListener {
      val destIntent = HandymanProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomeOne(
    view: View,
    position: Int,
    item: HomeOneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearCard ->  {
        val destIntent = CancelFinishWorkingActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerHomeOne1(
    view: View,
    position: Int,
    item: HomeOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
