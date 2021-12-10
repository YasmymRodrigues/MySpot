package com.example.myspot.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
//import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "cars")
data class Car (
    var marca:String,
    var modelo:String,
    var data: Date,
    var matricula:String,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0){


}

