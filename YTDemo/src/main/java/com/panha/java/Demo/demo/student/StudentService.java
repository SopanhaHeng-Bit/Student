package com.panha.java.Demo.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Panha",
                        "Male",
                        LocalDate.of(2004, Month.MARCH,21),
                        20
                )
        );
    }
}
