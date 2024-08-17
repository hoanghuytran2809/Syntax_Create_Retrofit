package com.example.syntax_create_retrofit.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.syntax_create_retrofit.DemoApplication
import com.example.syntax_create_retrofit.database.dao.ResourceAppDao
import com.example.syntax_create_retrofit.model.ResourceApp
import com.example.syntax_create_retrofit.model.Student

@Database(
    entities = [ResourceApp::class,Student::class],
    version = 2,
    exportSchema = false
)
abstract class AndroidDatabase : RoomDatabase() {
    abstract fun resourceAppDao(): ResourceAppDao
    companion object {
        private var instance: AndroidDatabase? = null
        fun getDatabase(tableName: String = "LizAi-Database"): AndroidDatabase {
            return instance ?: synchronized(this) {
                val room = Room.databaseBuilder(
                    DemoApplication.instance,
                    AndroidDatabase::class.java,
                    tableName
                )
                    .fallbackToDestructiveMigration()
                    .build()
                instance = room
                room
            }
        }

    }
}