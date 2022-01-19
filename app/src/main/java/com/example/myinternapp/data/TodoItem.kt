package com.example.myinternapp.data

import java.util.*
import kotlin.collections.ArrayList

data class TodoItem(
   val name: String,
   val description: String,
   val tags: ArrayList<Tag>,
   val completed: Boolean,
   val createdDate: Date,
)