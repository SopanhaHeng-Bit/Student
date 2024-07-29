package com.panha.java.Demo.demo.student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private String gender;
    private LocalDate dob;
    private int age;

    public Student() {
    }

    public Student(long id, String name, String gender, LocalDate dob, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "  id   =" + id +
                ", name ='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob   =" + dob +
                ", age   =" + age +
                '}';
    }
}
