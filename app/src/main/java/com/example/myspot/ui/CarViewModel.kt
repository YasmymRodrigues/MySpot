package com.example.myspot.ui

import android.app.Application
import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myspot.CarDatabase
import com.example.myspot.CarLogic
import com.example.myspot.repository.CarRepository
import kotlinx.coroutines.launch

    /*private val storage = CarDatabase.getInstance(application).CarDAO()
    private val logic = CarLogic(storage)*/

class CarViewModel(private val repository: CarRepository): ViewModel() {

    fun addCar(modelo: String, marca: String, matricula: String, data : String) = viewModelScope.launch {
        try {
            val id = repository.insertCar(marca, modelo, matricula, data)

        } catch (ex: Exception) {

            Log.e(TAG, ex.toString())
        }
    }

    companion object {
        private val TAG = CarViewModel::class.java.simpleName
        }
    }

