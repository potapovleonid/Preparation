package ru.home.des.services;

import org.springframework.stereotype.Service;
import ru.home.des.entity.Student;
import ru.home.des.repositories.StudentRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
        init();
    }

    private void init(){
        repository.saveAll(Arrays.asList(
                new Student(null, "Alex", 20),
                new Student(null, "Emma", 21),
                new Student(null, "Jimm", 22),
                new Student(null, "Brad", 23)
        ));
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void removeById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void removeStudent(Student student) {
        repository.delete(student);
    }

    @Override
    public void saveOrUpdate(Student student) {
        repository.save(student);
    }
}
