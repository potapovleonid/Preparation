package ru.home.des.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.des.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
