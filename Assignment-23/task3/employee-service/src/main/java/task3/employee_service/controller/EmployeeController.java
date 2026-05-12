package task3.employee_service.controller;

import task3.employee_service.model.Employee;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

  @GetMapping("/employees/{id}")
  public Employee getEmployee(@PathVariable int id) {

    return new Employee(
        id,
        "Vicky");
  }
}