package com.saqibestates.app.modules.chats.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseActivity
import com.saqibestates.app.databinding.ActivityChatsBinding
import com.saqibestates.app.modules.chats.`data`.model.ChatsRowModel
import com.saqibestates.app.modules.chats.`data`.viewmodel.ChatsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatsActivity : BaseActivity<ActivityChatsBinding>(R.layout.activity_chats) {
  private val viewModel: ChatsVM by viewModels<ChatsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chatsAdapter = ChatsAdapter(viewModel.chatsList.value?:mutableListOf())
    binding.recyclerChats.adapter = chatsAdapter
    chatsAdapter.setOnItemClickListener(
    object : ChatsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatsRowModel) {
        onClickRecyclerChats(view, position, item)
      }
    }
    )
    viewModel.chatsList.observe(this) {
      chatsAdapter.updateData(it)
    }
    binding.chatsVM = viewModel
    setUpSearchViewGroupFourListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerChats(
    view: View,
    position: Int,
    item: ChatsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupFourListener(): Unit {
    binding.searchViewGroupFour.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "CHATS_ACTIVITY"

    }
  }
