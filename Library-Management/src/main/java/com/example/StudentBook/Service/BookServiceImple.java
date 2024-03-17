package com.example.StudentBook.Service;

import com.example.StudentBook.EntityRequestResponse.BookRequest;
import com.example.StudentBook.EntityRequestResponse.BookResponse;
import com.example.StudentBook.Etitity.Book;
import com.example.StudentBook.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImple implements BookService {

    @Autowired
    BookRepository bookRepository;


    public BookResponse createBook(BookRequest bookRequest) {

        Book book = new Book();
        book.setPublishedYear(bookRequest.getPublishedYear());
        book.setBookName(bookRequest.getBookName());
        book.setBookPages(bookRequest.getBookPages());
        book.setBookId(bookRequest.getBookId());
        book.setAuthor(bookRequest.getAuthor());
        book.setBooktype(bookRequest.getBooktype());

        bookRepository.save(book);

        BookResponse response=new BookResponse();
        response.setBookId(book.getBookId());
        response.setBookPages(book.getBookPages());
        response.setAuthor(book.getAuthor());
        response.setBooktype(book.getBooktype());
        response.setPublishedYear(book.getPublishedYear());

        return response;
    }

    public void deleteBook(String bookId) {

        bookRepository.deleteById(bookId);

    }


    public BookResponse updateBook(BookRequest bookRequest) {

        Book book = new Book();
        book.setPublishedYear(bookRequest.getPublishedYear());
        book.setBookName(bookRequest.getBookName());
        book.setBookPages(bookRequest.getBookPages());
        book.setBookId(bookRequest.getBookId());
        book.setAuthor(bookRequest.getAuthor());
        book.setBooktype(bookRequest.getBooktype());

        bookRepository.save(book);

        BookResponse response1=new BookResponse();
        response1.setBookId(book.getBookId());
        response1.setBookPages(book.getBookPages());
        response1.setAuthor(book.getAuthor());
        response1.setBooktype(book.getBooktype());
        response1.setPublishedYear(book.getPublishedYear());

        return response1;
    }


    public List<BookResponse> getBooksData() {

        List<Book> books = bookRepository.findAll();
       List<BookResponse> bookResponseList = new ArrayList<>();
        for(Book book : books)
        {
            BookResponse response2 = new BookResponse();
            response2.setBookId(book.getBookId());
            response2.setBookName(book.getBookName());
            response2.setBooktype(book.getBooktype());
            response2.setAuthor(book.getAuthor());
            response2.setPublishedYear(book.getPublishedYear());
            bookResponseList.add(response2);
        }

        return bookResponseList;
    }


    public BookResponse getDataByBookId(String bookId) {

        Book book = bookRepository.findByBookId(bookId);
        BookResponse response=new BookResponse();
        response.setBookName(book.getBookName());
        response.setBookPages(book.getBookPages());
        response.setBookId(book.getBookId());
        response.setBooktype(book.getBooktype());
        response.setPublishedYear(book.getPublishedYear());
        return response;
    }



    @Override
    public BookResponse getDataByBookName(String bookName) {

        Book book = bookRepository.findByName(bookName);
        BookResponse response1 = new BookResponse(book.getBookId(),
                                                 book.getBookName(),
                                                 book.getBooktype(),
                                                 book.getBookPages(),
                                                 book.getAuthor(),
                                                 book.getPublishedYear());

      //            (or)

//        response1.setBookName(book.getBookName());
//        response1.setBookId(book.getBookId());
//        response1.setBooktype(book.getBooktype());
//        response1.setBookPages(book.getBookPages());
//        response1.setAuthor(book.getAuthor());
//        response1.setPublishedYear(book.getPublishedYear());

        return response1;

    }
}





