package task4.student_service.controller;

import task4.student_service.model.Student;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

  @GetMapping("/students/{id}")
  public Student getStudent(@PathVariable int id) {

    return new Student(
        id,
        "Vicky");
  }
}