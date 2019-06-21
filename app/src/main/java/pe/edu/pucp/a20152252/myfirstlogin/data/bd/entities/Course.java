package pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "COURSE")
public class Course {
    @PrimaryKey
    @ColumnInfo(name = "COURSE_ID")
    private int courseId;
    @ColumnInfo(name = "NAME")
    private String name;
    @ColumnInfo(name = "PROFESSOR")
    private String professor;
    @ColumnInfo(name = "SCHEDULE_ID")
    private int scheduleId;

    public Course(int courseId, String name, String professor, int scheduleId) {
        this.courseId = courseId;
        this.name = name;
        this.professor = professor;
        this.scheduleId = scheduleId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public String getProfessor() {
        return professor;
    }

    public int getScheduleId() {
        return scheduleId;
    }
}
