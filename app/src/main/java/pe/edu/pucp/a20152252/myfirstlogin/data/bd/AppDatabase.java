package pe.edu.pucp.a20152252.myfirstlogin.data.bd;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao.CourseDao;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao.ProfessorDao;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao.ScheduleDao;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao.UserDao;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.Course;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.Professor;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.User;
import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.schedule;

@Database(entities = {User.class, Professor.class, schedule.class, Course.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DB_NAME = "myfirstlogin.db";
    private static AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, DB_NAME).build();
        }
        return INSTANCE;
    }

    public abstract UserDao userDao();
    public abstract ScheduleDao scheduleDao();
    public abstract CourseDao courseDao();
    public abstract ProfessorDao professorDao();
}
