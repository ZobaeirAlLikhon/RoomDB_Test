package com.example.roomdb_test.local_RM_DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface InfoDao {
    @Query("SELECT * FROM Info")
    List<Info> getAll();
    @Insert()
    void insertInfo(Info info);
    @Delete()
    void deletInfo(Info info);
}
