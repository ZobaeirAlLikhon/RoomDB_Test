package com.example.roomdb_test.local_RM_DB;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Info.class},version = 1,exportSchema = false)
public  abstract class InfoDatabase extends RoomDatabase {
    private static InfoDatabase INSTANCE;
    public static InfoDatabase getDatabaseInstance(Context context)
    {
        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),InfoDatabase.class,"my_db")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return INSTANCE;
    }
    public abstract InfoDao infoDao();

}
