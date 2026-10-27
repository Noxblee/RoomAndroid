package com.example.bazadanych;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface GryDAO {
    @Insert
    public void wstawGreDoBazy(Gra ... gry);

    @Delete
    public void usunZBazy(Gra gra);
    @Update
    public void aktualizujGre(Gra gra);
    @Query("Select * from gry")
    public List<Gra> zwrocWszystkieGry();

    @Query("SELECT nazwa FROM gry WHERE minGraczy = :ile")
    public List<String> FiltrujPoMinGraczy(int ile);
}
