package com.saqibestates.app.modules.chatshandyman.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityChatsHandymanBinding
import com.saqibestates.app.modules.chatshandyman.`data`.viewmodel.ChatsHandymanVM
import kotlin.String
import kotlin.Unit

class ChatsHandymanActivity :
    BaseActivity<ActivityChatsHandymanBinding>(R.layout.activity_chats_handyman) {
  private val viewModel: ChatsHandymanVM by viewModels<ChatsHandymanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatsHandymanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHATS_HANDYMAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatsHandymanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
