package com.example.StudentBook.Controller;

import com.example.StudentBook.EntityRequestResponse.BookRequest;
import com.example.StudentBook.EntityRequestResponse.BookResponse;
import com.example.StudentBook.EntityRequestResponse.StudentBookJoin;
import com.example.StudentBook.Service.AssignBookService;
import com.example.StudentBook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    BookService bookService;

    @Autowired
    AssignBookService assignBookService;



    @PostMapping("/creating")
    public BookResponse createBook(@RequestBody BookRequest bookRequest)
    {
       return  bookService.createBook(bookRequest);
    }




    @PutMapping("/updating")
    public  BookResponse updateBook(@RequestBody BookRequest bookRequest)
    {
       return bookService.updateBook(bookRequest);

    }




    @DeleteMapping("/deleting")
    public void deleteBook(@RequestParam String bookId)
    {
        bookService.deleteBook(bookId);
    }



    @GetMapping("/booksData")
    public List<BookResponse> getBook()
    {
        return bookService.getBooksData();
    }



    @GetMapping("/getDataByBookId/{bookId}")
    public BookResponse getDataByBookId(@PathVariable String bookId)
    {
        return bookService.getDataByBookId(bookId);
    }


    @GetMapping("/getDataByBookName/{bookName}")
    public BookResponse getDataByBookName(@PathVariable String bookName)
    {
        return bookService.getDataByBookName(bookName);
    }





}
