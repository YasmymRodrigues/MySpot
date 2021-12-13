package com.example.myspot.repository

import android.os.Parcel
import android.os.Parcelable
import com.example.myspot.CarDAO
import com.example.myspot.data.db.entity.Car


//Classe para ser uma fonte de dados de base de dados(nesse caso Room)

class DataBaseDataSource(private val carDAO: CarDAO) : CarRepository {
    //quem vai gerenciar a chegada de dados


    override suspend fun insertCar(
        marca: String,
        modelo: String,
        data: String,
        matricula: String
    ): Long {
        val car = Car(
            marca = marca,
            modelo = modelo,
            data = data,
            matricula = matricula
        )
        return carDAO.insert(car)
    }

    override suspend fun updateCar(id: Int, marca: String, modelo: String, matricula: String) {

    }

    override suspend fun deleteCar(id: Int) {
        carDAO.delete(id)
    }

    override suspend fun deleteAllCars() {
        TODO("Not yet implemented")
    }


    /* override suspend fun deleteAllCars() {
         carDAO.deleteAll()
     }*/

    override suspend fun getAllCars(): List<Car> {
       return carDAO.getAll()

    }

}
