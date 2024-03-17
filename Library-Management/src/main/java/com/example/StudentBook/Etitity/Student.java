package com.example.StudentBook.Etitity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NewStudents")
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String gender;
    private int age;
    private String city;
    private Long phoneNumber;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="STUDENTSANDBOOKS",
               joinColumns = @JoinColumn(name="bookId"),
                inverseJoinColumns = @JoinColumn(name="studentId")
    )
    private List<Book> book = new ArrayList<>();

}
