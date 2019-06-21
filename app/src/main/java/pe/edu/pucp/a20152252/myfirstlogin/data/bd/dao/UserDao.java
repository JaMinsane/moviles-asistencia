package pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.User;

@Dao
public interface UserDao {

    @Query("SELECT * FROM USER WHERE USERNAME = :username LIMIT 1")
    User findByUsername(String username);

    @Query("SELECT * FROM USER WHERE USER_ID = :userId LIMIT 1")
    User findById(int userId);

    @Insert
    void insert(User user);

    @Delete
    void delete(User user);
}
