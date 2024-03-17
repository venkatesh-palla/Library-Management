package com.example.StudentBook.EntityRequestResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private int studentId;
    private String studentName;
    private String gender;
    private int age;
    private String city;
    private Long phoneNumber;

}
