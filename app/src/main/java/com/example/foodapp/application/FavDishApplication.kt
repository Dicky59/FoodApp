package com.example.foodapp.application

import android.app.Application
import com.example.foodapp.model.database.FavDishRepository
import com.example.foodapp.model.database.FavDishRoomDatabase

class FavDishApplication : Application() {

    private val database by lazy { FavDishRoomDatabase.getDatabase(this@FavDishApplication) }

    val repository by lazy { FavDishRepository(database.favDishDao()) }
}