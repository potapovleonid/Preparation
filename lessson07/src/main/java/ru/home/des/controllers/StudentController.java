package ru.home.des.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.home.des.entity.Student;
import ru.home.des.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public String allStudents(Model model){
        model.addAttribute("students", service.getAll());
        return "all_students";
    }

    @GetMapping("/new_student")
    public String newStudent(Model model){
        model.addAttribute("student", new Student());
        return "student_form";
    }

    @GetMapping("/{id}")
    public String getStudent(Model model, @PathVariable Long id){
        model.addAttribute("student", service.findById(id));
        return "student";
    }

    @GetMapping("/{id}/delete")
    public String deleteStudent(@PathVariable Long id){
        service.removeById(id);
        return "redirect:/students";
    }

    @PostMapping("/{id}")
    public String updateStudent(Student studentForm, @PathVariable Long id){
        service.saveOrUpdate(studentForm);
        return "redirect:/students";
    }
}
