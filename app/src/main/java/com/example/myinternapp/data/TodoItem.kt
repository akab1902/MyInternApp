package com.example.myinternapp.data

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat
import java.util.*
import kotlin.collections.ArrayList

@Entity (tableName = "todoItems_table")
@Parcelize
data class TodoItem(
   val name: String,
   val description: String,
   val tags: ArrayList<Tag>,
   val completed: Boolean = false,
   val createdTime: Long = System.currentTimeMillis(),
   val deadlineDate: Date
): Parcelable {
   val createdDate: String
      get() = DateFormat.getDateTimeInstance().format(createdTime)
}