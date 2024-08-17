package com.example.syntax_create_retrofit.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.syntax_create_retrofit.model.ResourceApp

@Dao
interface ResourceAppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg resourceApp: ResourceApp)

    @Query("DELETE FROM ResourceApp")
    suspend fun delete()

    @Update
    suspend fun update(resourceApp: ResourceApp)

    @Query("SELECT * FROM ResourceApp")
    suspend fun getAll(): ResourceApp
}