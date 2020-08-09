package com.sih.todolist_room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {

    @Insert
    suspend fun insertTask(todoModel: TodoModel):Long

    @Query("Select * from TodoModel where isFinished != -1")
    fun getTask():LiveData<List<TodoModel>>

    //delete the task on left swipe
    //finished a task on the right swipe\

    @Query("Update TodoModel set isFinished = 1 where id=:uid")
    fun finishedTask(uid:Long)

    @Query("Delete From TodoModel Where id=:uid")
    fun deleteTask(uid: Long)



}