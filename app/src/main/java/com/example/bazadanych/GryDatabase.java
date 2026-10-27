package com.example.bazadanych;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Gra.class},version = 1) //więcej entities = {Gra.class, kolejna.class}|version = 1 -> zmiana struktury bazy danych
public abstract class GryDatabase extends RoomDatabase {
    public abstract GryDAO zwrocGryDAO();

}
