package com.example.projettdmubunto
import com.example.projettdmubunto.Ayah
import androidx.room.*

@Dao

interface AyahDao {
    @Query("select * from data")
    fun getAyahs():List<Ayah>
}
