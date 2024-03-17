package com.example.StudentBook.Etitity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "NewBook")
public class Book {

    @Id
    private String bookId;

    private String bookName;
    private String booktype;
    private int bookPages;
    private String author;
    private int publishedYear;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Student> student = new ArrayList<>();
}
