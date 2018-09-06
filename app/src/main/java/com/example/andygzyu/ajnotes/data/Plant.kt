package com.example.andygzyu.myapplication.data

import android.accounts.AuthenticatorDescription
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.icu.util.DateInterval

@Entity(tableName = "plants")
data class Plant(
        @PrimaryKey @ColumnInfo(name = "id") val plantId: String,
        val name: String,
        val description: String,
        val growZoneNumber: Int,
        val wateringInterval: Int = 7,
        val imageUrl: String = ""
) {

}