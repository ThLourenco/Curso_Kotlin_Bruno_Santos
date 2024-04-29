package com.example.approom

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [Usermodel::class], version = 1) // estou dizendo que dentro da array o
// user model sera uma tabela para essa base de dados
abstract class UserDataBase: RoomDatabase() {
}