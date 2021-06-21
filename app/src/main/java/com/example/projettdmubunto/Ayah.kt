package com.example.projettdmubunto


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data")
data class Ayah(
        val idRacine: Int?=null,
        val Racine: String?=null,
        val IDWord: Long?=null,
        val IDAya: String?=null,
        val idSourat: Int?=null,
        val NumAya: Int?=null,
        val ArabicWord:String?=null,
        val englishWord:String?=null,
        val TextAR: String?=null,
        val field10: String?=null,
        val field11: String?=null,
        val field12: String?=null,
        val field13: String?=null,
        @PrimaryKey(autoGenerate = true)
        val id: Int
)


//data class Ayah(val ayahtextar:String, val ayahtexten:String)
