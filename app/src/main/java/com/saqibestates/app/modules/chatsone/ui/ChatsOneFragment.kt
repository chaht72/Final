package com.saqibestates.app.modules.chatsone.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseFragment
import com.saqibestates.app.databinding.FragmentChatsOneBinding
import com.saqibestates.app.modules.chatsone.`data`.model.ChatsOneRowModel
import com.saqibestates.app.modules.chatsone.`data`.viewmodel.ChatsOneVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatsOneFragment : BaseFragment<FragmentChatsOneBinding>(R.layout.fragment_chats_one) {
  private val viewModel: ChatsOneVM by viewModels<ChatsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val chatsOneAdapter = ChatsOneAdapter(viewModel.chatsOneList.value?:mutableListOf())
    binding.recyclerChatsOne.adapter = chatsOneAdapter
    chatsOneAdapter.setOnItemClickListener(
    object : ChatsOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatsOneRowModel) {
        onClickRecyclerChatsOne(view, position, item)
      }
    }
    )
    viewModel.chatsOneList.observe(requireActivity()) {
      chatsOneAdapter.updateData(it)
    }
    binding.chatsOneVM = viewModel
    setUpSearchViewGroupFourListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerChatsOne(
    view: View,
    position: Int,
    item: ChatsOneRowModel
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
      const val TAG: String = "CHATS_ONE_FRAGMENT"


      fun getInstance(bundle: Bundle?): ChatsOneFragment {
        val fragment = ChatsOneFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
