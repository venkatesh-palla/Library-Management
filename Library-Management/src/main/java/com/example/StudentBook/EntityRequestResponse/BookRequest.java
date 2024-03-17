package com.example.StudentBook.EntityRequestResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {



    private String bookId;
    private String bookName;
    private String booktype;
    private int bookPages;
    private String author;
    private int publishedYear;



}
