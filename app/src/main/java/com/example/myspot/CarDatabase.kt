package com.example.myspot

import android.content.Context
import androidx.room.Room
import com.example.myspot.data.db.entity.Car
import androidx.room.Database;
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Car::class), version = 1)
abstract class CarDatabase: RoomDatabase(){

    abstract fun carDao(): CarDAO //implementar essa variavel e retornar um car
    companion object{
        private var instance: CarDatabase? = null
        fun getInstance(applicationContext : Context): CarDatabase{
            synchronized(this){
                if(instance == null){
                    instance = Room.databaseBuilder(applicationContext, CarDatabase::class.java, "car_db").build()
                }
                return instance as CarDatabase
            }
        }
    }
}