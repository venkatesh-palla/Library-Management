package com.example.StudentBook.EntityRequestResponse;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBookJoin {

    private int studentId;
    private String bookId;
    private String bookName;
    private String booktype;
    private int bookPages;
    private int age;
    private int publishedYear;
    private String author;
    private String studentName;
    private String gender;
    private String city;
    private Long phoneNumber;
}
