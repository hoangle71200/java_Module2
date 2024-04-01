package com.example.endmd3.repository;

import java.util.List;

public interface IObjectRepository<E> {
    List<E> findAll();
    void save(E e);
    void update(int id,E e);
    void remove(int id);
    E findById(int id);
}
