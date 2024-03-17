package com.example.StudentBook.Controller;

import com.example.StudentBook.EntityRequestResponse.StudentRequest;
import com.example.StudentBook.EntityRequestResponse.StudentResponse;
import com.example.StudentBook.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;




    @PostMapping("/creating")
    public StudentResponse createStudent(@RequestBody StudentRequest studentRequest)
    {
       return studentService.createStudent(studentRequest);

    }




    @PostMapping("/updating")
    public StudentResponse updateStudent(@RequestBody StudentRequest studentRequest)
    {
        return studentService.updateStudent(studentRequest);

    }




    @DeleteMapping("/delete")
    public void deleteStudent(@RequestParam int studentId)
    {
        studentService.deleteStudent(studentId);

    }


    @GetMapping("/retriving")
    public List<StudentResponse> getStudent()
    {
        return studentService.getStudentData();
    }




    @GetMapping("/retriveById")
    public StudentResponse getDataByStudendId(@RequestParam int studentId)
    {
        return studentService.getDataByStudendId(studentId);
    }




    @GetMapping("/retriveByName")
    public  StudentResponse getDataByStudentName(@RequestParam String studentName)
    {
        return studentService.getDataByStudentName(studentName);
    }


 }
