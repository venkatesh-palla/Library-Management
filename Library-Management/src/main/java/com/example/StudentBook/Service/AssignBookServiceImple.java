package com.example.StudentBook.Service;

import com.example.StudentBook.EntityRequestResponse.StudentBook;
import com.example.StudentBook.EntityRequestResponse.StudentBookJoin;
import com.example.StudentBook.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignBookServiceImple implements AssignBookService{

    @Autowired
    BookRepository bookRepository;


    @Override
    public StudentBook assign(StudentBook studentBook) {

        bookRepository.assign(studentBook);
        return studentBook;

    }

    @Override
    public void deassign(StudentBook studentBook) {
        bookRepository.deassign(studentBook);
    }

    @Override
    public List<StudentBook> getdata() {
        return bookRepository.getData();
    }

    @Override
    public List<StudentBookJoin> dataByMultipleTables() {

        return bookRepository.getDataBYMulti();
    }
}
