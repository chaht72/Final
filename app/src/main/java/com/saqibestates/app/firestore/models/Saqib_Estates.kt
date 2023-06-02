package com.saqibestates.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.collections.MutableList
import kotlin.jvm.JvmField

public class Saqib_Estates {
  @JvmField
  @PropertyName("UserName")
  public var userName: MutableList<String>? = null

  @JvmField
  @PropertyName("Email")
  public var email: MutableList<String>? = null
}
