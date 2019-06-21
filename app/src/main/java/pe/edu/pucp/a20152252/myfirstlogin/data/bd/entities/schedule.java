package pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "SCHEDULE")
public class schedule {
    @PrimaryKey
    @ColumnInfo(name = "SCHEDULE_ID")
    private int scheduleId;
    @ColumnInfo(name = "COURSE_ID")
    private int courseId;
    @ColumnInfo(name = "HOUR")
    private String hour;
    @ColumnInfo(name = "TYPE")
    private String type;
    @ColumnInfo(name = "DATE")
    private String date;
    @ColumnInfo(name = "CLASSROOM")
    private String classroom;
    @ColumnInfo(name = "LOCATION")
    private String location;

    public schedule(int scheduleId, int courseId, String hour,String type,String date, String classroom, String location) {
        this.scheduleId = scheduleId;
        this.courseId = courseId;
        this.hour = hour;
        this.date = date;
        this.classroom = classroom;
        this.location = location;
        this.type=type;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getHour() {
        return hour;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

}
