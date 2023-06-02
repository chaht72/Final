package com.saqibestates.app.modules.signupone.ui

import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivitySignUpOneBinding
import com.saqibestates.app.modules.homeone.ui.HomeOneActivity
import com.saqibestates.app.modules.signupone.`data`.viewmodel.SignUpOneVM
import kotlin.String
import kotlin.Unit

class SignUpOneActivity : BaseActivity<ActivitySignUpOneBinding>(R.layout.activity_sign_up_one) {
  private val viewModel: SignUpOneVM by viewModels<SignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnSignUp.setOnClickListener {
      val destIntent = HomeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ONE_ACTIVITY"

  }
}
