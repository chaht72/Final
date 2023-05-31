package com.saqibestates.app.modules.clientprofile.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.saqibestates.app.R
import com.saqibestates.app.appcomponents.base.BaseFragment
import com.saqibestates.app.databinding.FragmentClientProfileBinding
import com.saqibestates.app.modules.clientprofile.`data`.model.CardsstatisticRowModel
import com.saqibestates.app.modules.clientprofile.`data`.viewmodel.ClientProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ClientProfileFragment :
    BaseFragment<FragmentClientProfileBinding>(R.layout.fragment_client_profile) {
  private val viewModel: ClientProfileVM by viewModels<ClientProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val cardsstatisticAdapter =
    CardsstatisticAdapter(viewModel.cardsstatisticList.value?:mutableListOf())
    binding.recyclerCardsstatistic.adapter = cardsstatisticAdapter
    cardsstatisticAdapter.setOnItemClickListener(
    object : CardsstatisticAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CardsstatisticRowModel) {
        onClickRecyclerCardsstatistic(view, position, item)
      }
    }
    )
    viewModel.cardsstatisticList.observe(requireActivity()) {
      cardsstatisticAdapter.updateData(it)
    }
    binding.clientProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCardsstatistic(
    view: View,
    position: Int,
    item: CardsstatisticRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CLIENT_PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ClientProfileFragment {
      val fragment = ClientProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
