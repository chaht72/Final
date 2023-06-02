package com.saqibestates.app.modules.handymanprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityHandymanProfileBinding
import com.saqibestates.app.modules.handymanprofile.`data`.model.ListpriceRowModel
import com.saqibestates.app.modules.handymanprofile.`data`.viewmodel.HandymanProfileVM
import com.saqibestates.app.modules.landing.ui.LandingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HandymanProfileActivity :
    BaseActivity<ActivityHandymanProfileBinding>(R.layout.activity_handyman_profile) {
  private val viewModel: HandymanProfileVM by viewModels<HandymanProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpriceAdapter = ListpriceAdapter(viewModel.listpriceList.value?:mutableListOf())
    binding.recyclerListprice.adapter = listpriceAdapter
    listpriceAdapter.setOnItemClickListener(
    object : ListpriceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceRowModel) {
        onClickRecyclerListprice(view, position, item)
      }
    }
    )
    viewModel.listpriceList.observe(this) {
      listpriceAdapter.updateData(it)
    }
    binding.handymanProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLogout.setOnClickListener {
      val destIntent = LandingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListprice(
    view: View,
    position: Int,
    item: ListpriceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HANDYMAN_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HandymanProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
