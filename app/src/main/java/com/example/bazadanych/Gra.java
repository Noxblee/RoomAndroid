package com.example.bazadanych;

import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public int minGraczy;
    public int maxGraczy;
    public int minWiek;
    public String Kategoria;

    public Gra(String nazwa, int minGraczy, int maxGraczy, int minWiek, String kategoria) {
        this.nazwa = nazwa;
        this.minGraczy = minGraczy;
        this.maxGraczy = maxGraczy;
        this.minWiek = minWiek;
        Kategoria = kategoria;
    }
}
