package com.example.myspot.data.db.entity

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.PrimaryKey
import com.example.myspot.entity.Car

interface CarDAO {
     @Dao
     interface UserDao {
         @Query("SELECT * FROM cars")
         fun getAll(): List<Car>

         @Query("SELECT * FROM cars WHERE uid IN (:carIds)")
         fun loadAllByIds(userIds: IntArray): List<Car>

         @Query("SELECT * FROM user WHERE modelo " +
                 "last_name LIKE :last LIMIT 1")
         fun findByModelo(modelo: String): Car

         @Insert
         fun insertAll(vararg cars: Car)

         @Delete
         fun delete(car: Car)
     }
}