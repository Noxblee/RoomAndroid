package com.example.bazadanych;

import androidx.room3.Dao;
import androidx.room3.Delete;
import androidx.room3.Insert;
import androidx.room3.Query;
import androidx.room3.Update;

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

    @Query("SELECT nazwa FROM gry WHERE ninGraczy = :ile")
    public List<String> FiltrujPoMinGraczy(int ile);
}
