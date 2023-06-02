package com.saqibestates.app.modules.chatclient.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityChatClientBinding
import com.saqibestates.app.modules.chatclient.`data`.viewmodel.ChatClientVM
import kotlin.String
import kotlin.Unit

class ChatClientActivity : BaseActivity<ActivityChatClientBinding>(R.layout.activity_chat_client) {
  private val viewModel: ChatClientVM by viewModels<ChatClientVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatClientVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAT_CLIENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatClientActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
