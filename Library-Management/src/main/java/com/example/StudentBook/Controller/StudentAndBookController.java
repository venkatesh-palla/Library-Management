package com.example.StudentBook.Controller;


import com.example.StudentBook.EntityRequestResponse.StudentBook;
import com.example.StudentBook.EntityRequestResponse.StudentBookJoin;
import com.example.StudentBook.Service.AssignBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentbookassign")
public class StudentAndBookController {

    @Autowired
    AssignBookService assignBookService;

    @PostMapping("/assign")
    public  void assign(@RequestBody StudentBook studentBook)
    {
        assignBookService.assign(studentBook);

    }

    @PostMapping("/deassign")
    public void deAssign(@RequestBody StudentBook studentBook)
    {
        assignBookService.deassign(studentBook);
    }

    @GetMapping("/getdata")
    public List<StudentBook> getData()
    {
        return assignBookService.getdata();
    }


    @GetMapping("/getDataByMultipleTables")
    public List<StudentBookJoin> getDataByMultipleTables()
    {
        return assignBookService.dataByMultipleTables();
    }

}
