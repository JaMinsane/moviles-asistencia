package pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.Course;

@Dao
public interface CourseDao {
    @Query("SELECT * FROM COURSE WHERE COURSE_ID = :courseId LIMIT 1")
    Course findByID(int courseId);
    @Insert
    void insert(Course courseId);
    @Delete
    void delete(Course courseId);
}
