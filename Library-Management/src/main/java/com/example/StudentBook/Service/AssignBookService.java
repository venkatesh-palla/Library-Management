package com.example.StudentBook.Service;

import com.example.StudentBook.EntityRequestResponse.StudentBook;
import com.example.StudentBook.EntityRequestResponse.StudentBookJoin;

import java.util.List;


public interface AssignBookService {

    public StudentBook assign(StudentBook studentBook);

    public void deassign(StudentBook studentBook);

    public List<StudentBook> getdata();

    public List<StudentBookJoin> dataByMultipleTables();

}
