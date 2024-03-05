package Baitap20_2_1.service;

import Baitap20_2_1.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IService<Student> {
    private List<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        if (index == -1) {
            System.out.println("K co sinh vien nay");
        } else {
            list.remove(index);
        }
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        if (index == -1) {
            System.out.println("K co sinh vien nay");
        } else {
            list.set(index, student);
        }
    }

    @Override
    public List<Student> findAll() {
        return list;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}