package com.example.StudentBook.Repository;

import com.example.StudentBook.Etitity.Book;
import com.example.StudentBook.Etitity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Modifying
    @Transactional
    @Query(value = "update STUDENT SET student_name =:#{#ame.studentName} ,gender=:#{#ame.gender} where student_id = :#{#me.studentId}",
            nativeQuery = true)
    public abstract void update(@Param("ame") Student me);

//
//    @Query("SELECT  FROM Student  WHERE studentName = :name")
//    Student findByName(@Param("student_name") String name);

    @Query(value = "SELECT * FROM new_students  WHERE student_name = :studentName", nativeQuery = true)
    Student findByName(@Param("studentName") String studentName);
}
