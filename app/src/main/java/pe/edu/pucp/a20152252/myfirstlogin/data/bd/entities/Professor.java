package pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "PROFESSOR")
public class Professor {
    @PrimaryKey
    @ColumnInfo(name = "PROFESSOR_ID")
    private int professorId;
    @ColumnInfo(name = "FULL_NAME")
    private String fullName;
    @ColumnInfo(name = "EMAIL")
    private String email;
    @ColumnInfo(name = "HASH")
    private String hash;

    public Professor(int professorId, String fullName, String email, String hash) {
        this.professorId = professorId;
        this.fullName = fullName;
        this.email = email;
        this.hash = hash;
    }

    public int getProfessorId() {
        return professorId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
    public String getHash() {
        return hash;
    }
}
