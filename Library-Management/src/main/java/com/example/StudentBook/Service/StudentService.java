package com.example.StudentBook.Service;

import com.example.StudentBook.EntityRequestResponse.StudentRequest;
import com.example.StudentBook.EntityRequestResponse.StudentResponse;

import java.util.List;

public interface StudentService {

    public StudentResponse createStudent(StudentRequest student);

    public void deleteStudent(int studentId);

    public StudentResponse updateStudent(StudentRequest student);

    public List<StudentResponse> getStudentData();

    public StudentResponse getDataByStudendId(int studentId);

    public StudentResponse getDataByStudentName(String studentName);


}
