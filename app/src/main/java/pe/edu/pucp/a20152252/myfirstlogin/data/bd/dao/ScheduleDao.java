package pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.schedule;

@Dao
public interface ScheduleDao {
    @Query("SELECT * FROM SCHEDULE WHERE SCHEDULE_ID = :scheduleId LIMIT 1")
    schedule findByID(int scheduleId);
    @Insert
    void insert(schedule scheduleId);
    @Delete
    void delete(schedule scheduleId);
}
