package com.saqibestates.app.modules.finish.ui

import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityFinishBinding
import com.saqibestates.app.modules.finish.`data`.viewmodel.FinishVM
import com.saqibestates.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FinishActivity : BaseActivity<ActivityFinishBinding>(R.layout.activity_finish) {
  private val viewModel: FinishVM by viewModels<FinishVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finishVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINISH_ACTIVITY"

  }
}
