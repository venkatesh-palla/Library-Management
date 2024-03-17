package com.example.StudentBook.Service;

import com.example.StudentBook.EntityRequestResponse.BookRequest;
import com.example.StudentBook.EntityRequestResponse.BookResponse;

import java.util.List;

public interface BookService {

    public BookResponse createBook(BookRequest book);

    public void deleteBook(String bookId);

    public BookResponse updateBook(BookRequest book);

    public List<BookResponse> getBooksData();

    public BookResponse getDataByBookId(String bookId);

    public BookResponse getDataByBookName(String bookName);

}
