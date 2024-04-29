package com.example.approom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
class Usermodel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "userName")
    var userName: String=""

    @ColumnInfo(name = "passWord")
    var passWord: String=""


}