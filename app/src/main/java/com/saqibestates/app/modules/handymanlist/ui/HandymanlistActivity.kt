package com.saqibestates.app.modules.handymanlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityHandymanlistBinding
import com.saqibestates.app.modules.detailshandyman.ui.DetailsHandymanActivity
import com.saqibestates.app.modules.handymanlist.`data`.model.HandymanListRowModel
import com.saqibestates.app.modules.handymanlist.`data`.viewmodel.HandymanlistVM
import com.saqibestates.app.modules.ordersummary.ui.OrderSummaryActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HandymanlistActivity :
    BaseActivity<ActivityHandymanlistBinding>(R.layout.activity_handymanlist) {
  private val viewModel: HandymanlistVM by viewModels<HandymanlistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val handymanListAdapter =
    HandymanListAdapter(viewModel.handymanListList.value?:mutableListOf())
    binding.recyclerHandymanList.adapter = handymanListAdapter
    handymanListAdapter.setOnItemClickListener(
    object : HandymanListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HandymanListRowModel) {
        onClickRecyclerHandymanList(view, position, item)
      }
    }
    )
    viewModel.handymanListList.observe(this) {
      handymanListAdapter.updateData(it)
    }
    binding.handymanlistVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewBadge.setOnClickListener {
      val destIntent = OrderSummaryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtDetailsThree.setOnClickListener {
      val destIntent = DetailsHandymanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBookThree.setOnClickListener {
      val destIntent = OrderSummaryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtDetailsTwo.setOnClickListener {
      val destIntent = DetailsHandymanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBookTwo.setOnClickListener {
      val destIntent = OrderSummaryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHandymanList(
    view: View,
    position: Int,
    item: HandymanListRowModel
  ): Unit {
    when(view.id) {
      R.id.btnBook ->  {
        val destIntent = OrderSummaryActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.txtDetails ->  {
        val destIntent = DetailsHandymanActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HANDYMANLIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HandymanlistActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
