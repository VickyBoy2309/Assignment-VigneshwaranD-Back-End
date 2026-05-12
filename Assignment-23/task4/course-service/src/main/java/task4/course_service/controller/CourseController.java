package task4.course_service.controller;

import task4.course_service.model.CourseResponse;
import task4.course_service.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class CourseController {

  @Autowired
  private WebClient webClient;

  @GetMapping("/courses/{id}")
  public CourseResponse getCourse(
      @PathVariable int id) {

    Student student = webClient
        .get()
        .uri("http://localhost:8081/students/" + id)
        .retrieve()
        .bodyToMono(Student.class)
        .block();

    return new CourseResponse(
        "Spring Boot",
        student);
  }
}