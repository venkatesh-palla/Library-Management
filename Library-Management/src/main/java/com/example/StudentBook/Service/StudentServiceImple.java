package com.example.StudentBook.Service;

import com.example.StudentBook.EntityRequestResponse.StudentRequest;
import com.example.StudentBook.EntityRequestResponse.StudentResponse;
import com.example.StudentBook.Etitity.Student;
import com.example.StudentBook.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImple implements StudentService{

    @Autowired
    StudentRepository studentRepository;




    @Override
    public StudentResponse createStudent(StudentRequest studentRequest) {
        Student student = new Student();

        student.setStudentId(studentRequest.getStudentId());
        student.setStudentName(studentRequest.getStudentName());
        student.setCity(studentRequest.getCity());
        student.setAge(studentRequest.getAge());
        student.setGender(studentRequest.getGender());
        student.setPhoneNumber(studentRequest.getPhoneNumber());

        studentRepository.save(student);

        StudentResponse response = new StudentResponse();
        response.setStudentId(student.getStudentId());
        response.setPhoneNumber(studentRequest.getPhoneNumber());
        response.setStudentName(student.getStudentName());
        response.setCity(student.getCity());
        response.setGender(student.getGender());
        response.setAge(student.getAge());


        return  response;
    }


    public void deleteStudent(int studentId) {

       studentRepository.deleteById(studentId);

    }



    public StudentResponse updateStudent(StudentRequest studentRequest) {
        Student student = new Student();

        student.setStudentId(studentRequest.getStudentId());
        student.setStudentName(studentRequest.getStudentName());
        student.setCity(studentRequest.getCity());
        student.setAge(studentRequest.getAge());
        student.setGender(studentRequest.getGender());
        student.setPhoneNumber(studentRequest.getPhoneNumber());

        studentRepository.save(student);

        StudentResponse response = new StudentResponse();
        response.setStudentId(student.getStudentId());
        response.setPhoneNumber(studentRequest.getPhoneNumber());
        response.setStudentName(student.getStudentName());
        response.setCity(student.getCity());
        response.setGender(student.getGender());
        response.setAge(student.getAge());


        return  response;
    }


    public List<StudentResponse> getStudentData() {


       List<Student> students = studentRepository.findAll();

       List<StudentResponse> studentResponses = new ArrayList<>();

       for(Student student:students)
       {
           StudentResponse studentResponse = new StudentResponse();
           studentResponse.setAge(student.getAge());
           studentResponse.setStudentId(student.getStudentId());
           studentResponse.setStudentName(student.getStudentName());
           studentResponse.setCity(student.getCity());
           studentResponse.setPhoneNumber(student.getPhoneNumber());
           studentResponse.setGender(student.getGender());
           studentResponses.add(studentResponse);
       }

        return studentResponses;
    }


    public StudentResponse getDataByStudendId(int studentId) {

        Student student = studentRepository.findById(studentId).orElse(new Student());

        StudentResponse studentResponse = new StudentResponse();

        studentResponse.setStudentId(student.getStudentId());

        studentResponse.setStudentName(student.getStudentName());

        studentResponse.setCity(student.getCity());

        studentResponse.setGender(student.getGender());

        studentResponse.setPhoneNumber(student.getPhoneNumber());

        studentResponse.setAge(student.getAge());

        return studentResponse;


    }

    @Override
    public StudentResponse getDataByStudentName(String studentName) {

        Student student = studentRepository.findByName(studentName);
        StudentResponse studentResponse = new StudentResponse();
         if(student ==null)
         {
            return studentResponse;
         }

         studentResponse.setStudentId(student.getStudentId());

         studentResponse.setStudentName(student.getStudentName());

         student.setPhoneNumber(student.getPhoneNumber());

         studentResponse.setAge(student.getAge());

         studentResponse.setCity(student.getCity());

         studentResponse.setGender(student.getGender());

         return studentResponse;

    }




}
