ksApackage com.example.projettdmubunto

import android.annotation.SuppressLint
import android.content.Context
import androidx.room.Room

@SuppressLint("StaticFieldLeak")
object RoomService {
    private var dataBase: DataBase?=null;
    fun getDatabase(context: Context): DataBase{
        if(dataBase==null){
            dataBase = Room.databaseBuilder(context,DataBase::class.java,"name1")
                    .createFromAsset("data.db")
                    .allowMainThreadQueries().build()
        }
        return dataBase!!
    }

}