package com.sih.todolist_room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TodoModel(
    var title:String,
    var description:String,
    var category:String,
    var date:Long,
    var time:Long,
    var isFinished:Int = -1,
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
)

//Kotlin we have named arguments....