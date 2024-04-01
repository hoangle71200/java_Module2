package com.example.endmd3.service;

import com.example.endmd3.model.Student;
import com.example.endmd3.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements IObjectService<Student>{
    private StudentRepositoryImpl repository = new StudentRepositoryImpl();
    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public void update(int id, Student student) {
        repository.update(id, student);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public Student findById(int id) {
        return repository.findById(id);
    }
}
