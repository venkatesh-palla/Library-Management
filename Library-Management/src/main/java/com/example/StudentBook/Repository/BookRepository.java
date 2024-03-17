package com.example.StudentBook.Repository;

import com.example.StudentBook.EntityRequestResponse.StudentBook;
import com.example.StudentBook.EntityRequestResponse.StudentBookJoin;
import com.example.StudentBook.Etitity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public interface BookRepository extends JpaRepository<Book,String> {

    @Query(value = "SELECT * FROM new_book  WHERE book_name = :abc", nativeQuery = true)
    Book findByName(@Param("abc") String a);

    @Query(value = "SELECT * FROM new_book where book_id = :book",nativeQuery = true)
    Book findByBookId(@Param("book")String books);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO assignbook (student_id, book_id) VALUES (:#{#student.studentId}, :#{#student.bookId})" , nativeQuery = true)
    void assign(@Param("student") StudentBook student);

    @Modifying
    @Transactional
    @Query(value = "DELETE from assignbook where student_id=:#{#student.studentId} and book_id =:#{#student.bookId}" , nativeQuery = true)
    void deassign(@Param("student") StudentBook student);



    @Query(value = "SELECT * FROM assignbook", nativeQuery = true)
    List<Object[]> getDataNative(); // Fetch result as Object[]

    default List<StudentBook> getData() {
        List<Object[]> results = getDataNative();
        List<StudentBook> studentBooks = new ArrayList<>();
        for (Object[] result : results) {
            // Assuming StudentBook has a constructor that accepts the fields from the query result
            StudentBook studentBook = new StudentBook(
                    (Integer)result[0], (String)result[1]);
            studentBooks.add(studentBook);
        }
        return studentBooks;
    }


    @Query(value = "select new_book.book_id,new_book.book_name,author,new_students.student_id,student_name,phone_number from new_book inner join assignbook on new_book.book_id = assignbook.book_id inner join new_students on new_students.student_id = assignbook.student_id" ,nativeQuery = true )
    List<Object[]> getDataByMultipleTables();

    default List<StudentBookJoin> getDataBYMulti() {
        List<Object[]> results = getDataByMultipleTables();
        List<StudentBookJoin> studentBookJoi = new ArrayList<>();
        for (Object[] result : results) {
            StudentBookJoin studentBookJoin = new StudentBookJoin(

                    (Integer)result[3],
                    (String)result[0],
                    (String)result[1],
                    "",
                    0,0,
                    0,

                    (String)result[2],
                    (String)result[4],
                    "",
                    "",
                    (Long) result[5]
            );
            studentBookJoi.add(studentBookJoin);

        }
        return studentBookJoi;
    }

}
