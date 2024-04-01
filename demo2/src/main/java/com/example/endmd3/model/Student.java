package com.example.endmd3.model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private String email;
    private String address;
    private String phone;
    private String classroom;

    public Student() {
    }

    public Student(String name, String birthday, String email, String address, String phone, String classroom) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.classroom = classroom;
    }

    public Student(int id, String name, String birthday, String email, String address, String phone, String classroom) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
