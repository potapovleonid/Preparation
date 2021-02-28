package ru.home.des.services;


import ru.home.des.entity.Student;

import java.util.List;

public interface StudentService {
    Student findById(Long id);
    List<Student> getAll();
    void removeById(Long id);
    void removeStudent(Student student);
    void saveOrUpdate(Student student);
}
