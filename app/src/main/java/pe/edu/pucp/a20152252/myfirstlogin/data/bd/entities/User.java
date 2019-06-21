package pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "USER")

public class User {
    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getHash() {
        return hash;
    }

    public User(int userId, String fullName, String email, String username, String hash) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.hash = hash;
    }

    @PrimaryKey
    @ColumnInfo(name = "USER_ID")
    private int userId;

    @ColumnInfo(name = "FULL_NAME")
    private String fullName;

    @ColumnInfo(name = "EMAIL")
    private String email;

    @ColumnInfo(name = "USERNAME")
    private String username;

    @ColumnInfo(name = "HASH")
    private String hash;
}
