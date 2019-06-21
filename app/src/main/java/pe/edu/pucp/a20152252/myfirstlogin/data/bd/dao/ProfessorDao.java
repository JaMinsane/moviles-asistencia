package pe.edu.pucp.a20152252.myfirstlogin.data.bd.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import pe.edu.pucp.a20152252.myfirstlogin.data.bd.entities.Professor;

@Dao
public interface ProfessorDao {
    @Query("SELECT * FROM PROFESSOR WHERE PROFESSOR_ID = :professorId LIMIT 1")
    Professor findByID(int professorId);
    @Insert
    void insert(Professor professor);
    @Delete
    void delete(Professor professor);
}
